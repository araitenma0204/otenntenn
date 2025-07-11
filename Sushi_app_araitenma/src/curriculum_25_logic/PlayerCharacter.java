package curriculum_25_logic;

// PlayerCharacterクラスはCharacterLogicを継承するサブクラス

public class PlayerCharacter extends CharacterLogic {

	// 空のコンストラクタ（親クラスの空コンストラクタを呼び出す）

	public PlayerCharacter() {
		super();
	}

	// 引数ありコンストラクタ（親クラスの同名コンストラクタを呼び出す）

	public PlayerCharacter(String name, int hp, int mp, int attack, int speed, int defense) {
		super(name, hp, mp, attack, speed, defense);
	}

	// ステータス表示をオーバーライドしてメッセージを追加表示

	@Override
	public void displayStatus() {
		System.out.println("こんにちは「" + getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getAttack());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDefense());
		System.out.println("さあ冒険に出かけよう！");
		System.out.println();
	}
}
