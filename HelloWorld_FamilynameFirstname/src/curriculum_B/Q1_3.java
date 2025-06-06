package curriculum_B;

import java.util.Objects;
import java.util.Random; //randomをインポート
import java.util.Scanner; // 入力を受け取るための準備（メモ）

public class Q1_3 {
	public static void main(String[] args) {
		
		//入力の準備
		
		Scanner scanner = new Scanner(System.in); 

		//コンソールにユーザー名を入力してくださいと表示

		System.out.println("ユーザー名を入力してください");
		String userName = scanner.nextLine();
		// 入力された文字列を受け取る ↑（メモ）
		
		//入力が正しくヴァリデーションされたかどうかのフラグ
		boolean isValidate = false;

		//コンソールに打ち込んだ値に応じて出力
		if (userName.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
		} else if (Objects.isNull(userName) || userName.length() <= 0) {
			System.out.println("「名前を入力してください」");
		} else if (!userName.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("「半角英数字のみで名前を入力してください」");
		} else {
			System.out.println("ユーザー名" + userName + "を登録しました");
			isValidate = true;
		}

		//ヴァリデーションに成功後ジャンケン開始
		//コンピューターの手をランダムにするためのインスタンス
		
		if (isValidate) {
			Random random = new Random();
			
			//ジャンケンの手の種類
			
			String[] hands = { "グー", "チョキ", "パー" };
			
			//ジャンケン回数をカウントするための準備

			int count = 0;

			//ユーザーがジャンケンに勝つまでのループを開始
			
			while (true) {

				System.out.println("\nじゃんけんをしましょう！");
				System.out.println("0: グー, 1: チョキ, 2: パー のいずれかを入力してください:");
				
				 // 入力が整数かどうかを確認（例：文字列や記号はNG）
				
				if (!scanner.hasNextInt()) {
					System.out.println("※ 数字を入力してください！");
					
					// 誤入力を飛ばす
					
					scanner.next();
					
					// 最初に戻る
					
					continue; 
				}

				//	ユーザーが選んだ手を取得
				int userHand = scanner.nextInt();
				if (userHand < 0 || userHand > 2) {
					System.out.println("*0~2の数字を入力してください");
					continue;
				}
				
				//ループした回数をここからカウントしていく
				
				count++;

				//コンピューターの手をランダムにする
				
				int computerHand = random.nextInt(3);

				System.out.println(userName + "の手" + hands[userHand]);
				System.out.println("相手の手" + hands[computerHand]);

				//勝敗の条件分岐
				
				if (userHand == computerHand) {
					System.out.println("DRAW あいこ もう一回しましょう！");
				} else if ((userHand == 0 && computerHand == 1) || 
						(userHand == 1 && computerHand == 2) || 
						(userHand == 2 && computerHand == 0)) { 
					System.out.println("次は俺にリベンジさせて");
					System.out.println("【" + count + "回目で勝利！】");
					
					// ループ終了（ジャンケン終了）
					
					break;
					
				//負けた手によってコメント表示
				} else {
					switch (computerHand) {
					case 0:
						System.out.println("俺の勝ち！");
						System.out.println("負けは次につながるチャンスです！");
						System.out.println("ネバーギブアップ！");
						break;
					case 1:
						System.out.println("俺の勝ち！");
						System.out.println("たかがじゃんけん、そう思ってないですか？");
						System.out.println("それやったら次も、俺が勝ちますよ");
						break;
					case 2:
						System.out.println("俺の勝ち！");
						System.out.println("なんで負けたか、明日まで考えといてください。");
						System.out.println("そしたら何かが見えてくるはずです");
						break;
					}
				}
			}
		} else {
			
			// ユーザー名登録がうまくいかなかった場合の出力
			
			System.out.println("validation失敗");
		}

		scanner.close();
	}
}
// 緑はメソッド
//メソッドは一連の処理に名前を付ける
