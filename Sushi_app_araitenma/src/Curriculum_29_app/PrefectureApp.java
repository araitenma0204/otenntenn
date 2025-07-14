package Curriculum_29_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Curriculum_29_logic.PrefectureLogic;

public class PrefectureApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		PrefectureLogic[] data = {

				//インスタンス生成 
				new PrefectureLogic("北海道", "札幌市", 83424),
				new PrefectureLogic("青森県", "青森市", 9646),
				new PrefectureLogic("岩手県", "盛岡市", 15275),
				new PrefectureLogic("宮城県", "仙台市", 7282),
				new PrefectureLogic("秋田県", "秋田市", 11638),
				new PrefectureLogic("山形県", "山形市", 9323),
				new PrefectureLogic("福島県", "福島市", 13784),
				new PrefectureLogic("茨城県", "水戸市", 6097),
				new PrefectureLogic("栃木県", "宇都宮市", 6408),
				new PrefectureLogic("群馬県", "前橋市", 6362),
				new PrefectureLogic("埼玉県", "さいたま市", 3798)

		};
		System.out.println("番号をカンマ区切りで入力して下さい（例:1,3,5)");
		String[] inputIndexes = scanner.nextLine().split(",");

		// 選択された都道府県を格納するリストを準備

		List<PrefectureLogic> selected = new ArrayList<>();

		// 入力された番号を1つずつ取り出して処理

		for (String indexStr : inputIndexes) {
			try {
				// 文字列を整数に変換（前後の空白を除去）

				int idx = Integer.parseInt(indexStr.trim());

				// 配列の範囲内かどうかチェック
				if (idx >= 0 && idx < data.length) {
					// 範囲内なら対応する都道府県を選択リストに追加
					selected.add(data[idx]);
				} else {
					// 範囲外の番号の場合は警告表示
					System.out.println("無効な番号：" + idx);
				}
			} catch (NumberFormatException e) {
				// 数字に変換できない入力に対するエラーメッセージ
				System.out.println("数値として読み取れません：" + indexStr);
			}
		}

		// 昇順または降順の指定をユーザーから入力してもらう

		System.out.print("昇順 or 降順を入力してください（asc/desc）：");
		String sortType = scanner.nextLine().trim();

		// 昇順か降順かに応じて面積でソートする

		if (sortType.equalsIgnoreCase("desc")) {

			// 降順ソート（面積が大きい順）

			selected.sort((a, b) -> Double.compare(b.getArea(), a.getArea()));
		} else {
			// 昇順ソート（面積が小さい順）

			selected.sort((a, b) -> Double.compare(a.getArea(), b.getArea()));
		}

		// ソート後の都道府県情報を順番に表示

		System.out.println("\n--- 結果 ---");
		for (PrefectureLogic p : selected) {
			p.display();
		}

		// Scannerを閉じてリソースを解放
		scanner.close();
	}
}
