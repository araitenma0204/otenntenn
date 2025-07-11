package curriculum_25_app;

import java.util.Random;
import java.util.Scanner;

// PlayerCharacterクラスをインポート

import curriculum_25_logic.PlayerCharacter;

public class CharacterApp {

	public static void main(String[] args) {

		// Scannerクラスで入力受付準備

		Scanner scanner = new Scanner(System.in);

		// Randomクラスで乱数生成準備

		Random rand = new Random();

		// 名前の入力を促す表示

		System.out.print("名前を入力してください: ");

		// 入力された名前を取得

		String inputName = scanner.nextLine();

		// 入力がnullまたは空文字の場合は「名無し」に置き換え

		if (inputName == null || inputName.isEmpty()) {
			inputName = "名無し";
		}

		// ランダムにステータスを生成

		int hp = rand.nextInt(501) + 500; // 500～1000の範囲
		int mp = rand.nextInt(301) + 300; // 300～600の範囲
		int attack = rand.nextInt(201) + 100; // 100～300の範囲
		int speed = rand.nextInt(401) + 200; // 200～600の範囲
		int defense = rand.nextInt(51) + 10; // 10～60の範囲

		// 空コンストラクタでPlayerCharacterを生成
		PlayerCharacter player = new PlayerCharacter();

		// セッターを使ってフィールドに値をセット
		player.setName(inputName);
		player.setHp(hp);
		player.setMp(mp);
		player.setAttack(attack);
		player.setSpeed(speed);
		player.setDefense(defense);

		// ステータスを表示
		player.displayStatus();

		// Scannerを閉じてリソース解放
		scanner.close();
	}
}
