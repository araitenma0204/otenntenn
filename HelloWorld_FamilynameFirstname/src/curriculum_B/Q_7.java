package curriculum_B;

import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N;//人数の変数を宣言

		//do whileでNが2以上になるまで再実行

		do {
			System.out.print("生徒の人数を入力してください（2以上）：");
			N = scanner.nextInt();
		} while (N < 2);

		//教科ごとの配列を宣言
		//二次元配列の宣言

		String[] subjects = { "英語", "数学", "理科", "社会" };
		int[][] scores = new int[N][4];
		double totalSum = 0;

		//二重for文
		//iは０だから表示がおかしくなるから＋１する
		//教科ごとの点数を回してから次の人の点数に移る

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%d人目の「%s」の点数を入力してください: ", i + 1, subjects[j]);
				scores[i][j] = scanner.nextInt();

			}
		}

		//〇人目の平均点を出す

		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += scores[i][j];
			}
			double avg = sum / 4.0;
			totalSum += sum;
			System.out.printf("%d人目の平均点は %.2f 点です。\n", i + 1, avg);

		}

		//二重for文で大枠を教科にして教科ごとの平均点を出す

		for (int j = 0; j < 4; j++) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += scores[i][j];
			}
			double avg = sum / N;
			System.out.printf("%sの平均点は %.2f 点です。\n", subjects[j], avg);
		}

		//totalSumを人数×４教科で割って全体の平均点を出す

		System.out.printf("全体の平均点は %.2f 点です。\n", totalSum / (N * 4.0));
	}

}
