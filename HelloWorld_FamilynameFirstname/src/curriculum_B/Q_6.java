package curriculum_B;

//乱数を作るためのクラスを読み込み
import java.util.Random;
import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {

		// 入力の準備
		// 「、」を入力したら改行
		Scanner scanner = new Scanner(System.in);
		System.out.println("商品を「、」で区切って入力してください：");
		String input = scanner.nextLine();
		String[] items = input.split("、");

		//在庫の乱数生成

		Random random = new Random();

		//テレビとディスプレイの共通在庫
		//０～１１のランダムなテレビ在庫

		final int MAX_TV = 11;
		int tvStock = random.nextInt(MAX_TV + 1);

		//何が入力されたかの表示

		for (String item : items) {
			System.out.println("入力された商品：" + item);

			//個別の商品の0~11のランダム在庫数(テレビの共通在庫は後で上書きする)

			int num = random.nextInt(12);

			////それぞれ独立してランダム在庫を表示

			switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(item + "の残り台数は" + num + "です");
				break;

			//テレビとディスプレイの合計は１１台になるように

			case "テレビ":
			case "ディスプレイ":

				num = item.equals("テレビ") ? tvStock : MAX_TV - tvStock;
				System.out.println(item + "の残り台数は" + num + "です");
				break;

			//取り扱い外の商品の表示
			default:
				System.out.println("『" + item + "』は指定の商品ではありません");
				break;
			}

		}

	}

}
