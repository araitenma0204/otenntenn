package curriculum_B;

public class Q_5 {

	public static void main(String[] args) {

		// 課題５を出力

		System.out.println("課題５");

		// 一行目の条件が縦軸
		// 二行目の条件が横軸（中身）

		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 20; i++) {
				int ans = i * j;

				// %03d=3桁ゼロ埋め（最後のi=20以外）

				String piece = String.format("%03d * %03d = %03d", i, j, ans);

				// iが20になるまで横軸でループ、 pieceの後ろに||で区切る

				if (i != 20)
					piece += " || ";

				System.out.print(piece);
			}

			// iが20になった段階で改行

			System.out.println();
		}

	}

}
