package curriculum_B;

public class Q4 {

	public static void main(String[] args) {

		// 課題４を表示
		System.out.println("課題４");

		// 九九を作る二重ループ作成
		// 左側 掛けられる数（1〜9）  
		// 右側	 掛ける数（1〜9）

		for (int i = 1; i <= 9; i++) { // 左側
			for (int j = 1; j <= 9; j++) { //右側

				// 掛け算の答えを変数ansに代入するように

				int ans = i * j;

				// 掛け算の答えをpieceにする
				// 数値を文字列に変換する＝Storing for.mat
				// %02d （％はフォーマットの支持を始めるサイン）
				// 	     (0は左がカラなら０を埋める指示）
				//       (2は二桁に合わせる指示）
				//       (dは整数を表示する意味（decimal=１０進数))

				String piece = String.format("%02d * %02d = %02d", i, j, ans);

				// 右側の数字が9じゃなければ文字列の後に||をつけて文字列を分ける

				if (j != 9)
					piece += " || ";

				// 改行せずに入力をループさせる

				System.out.print(piece);
			}

			// ↑のループが終わったら改行してまた一から動くようにする
			System.out.println();

		}

	}

}
