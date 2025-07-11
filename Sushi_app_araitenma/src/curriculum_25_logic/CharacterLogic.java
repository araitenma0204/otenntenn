package curriculum_25_logic;

public class CharacterLogic {

	// キャラクター名を保持するフィールド

	private String name;

	// HP（体力）を保持するフィールド

	private int hp;

	// MP（魔力）を保持するフィールド

	private int mp;

	// 攻撃力を保持するフィールド

	private int attack;

	// 素早さを保持するフィールド

	private int speed;

	// 防御力を保持するフィールド

	private int defense;

	// 空のコンストラクタ（フィールド初期化なし）

	public CharacterLogic() {

		// 何もしない
	}

	// 引数ありコンストラクタ

	public CharacterLogic(String name, int hp, int mp, int attack, int speed, int defense) {

		// 名前をセット（nullや空文字なら「名無し」になる）

		setName(name);

		// HPをセット

		this.hp = hp;

		// MPをセット

		this.mp = mp;

		// 攻撃力をセット

		this.attack = attack;

		// 素早さをセット

		this.speed = speed;

		// 防御力をセット

		this.defense = defense;
	}

	// 名前のゲッター

	public String getName() {
		return name;
	}

	// 名前のセッター（nullや空文字なら「名無し」）

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			this.name = "名無し";
		} else {
			this.name = name;
		}
	}

	// HPのゲッター

	public int getHp() {
		return hp;
	}

	// HPのセッター

	public void setHp(int hp) {
		this.hp = hp;
	}

	// MPのゲッター

	public int getMp() {
		return mp;
	}

	// MPのセッター

	public void setMp(int mp) {
		this.mp = mp;
	}

	// 攻撃力のゲッター

	public int getAttack() {
		return attack;
	}

	// 攻撃力のセッター

	public void setAttack(int attack) {
		this.attack = attack;
	}

	// 素早さのゲッター

	public int getSpeed() {
		return speed;
	}

	// 素早さのセッター

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 防御力のゲッター

	public int getDefense() {
		return defense;
	}

	// 防御力のセッター

	public void setDefense(int defense) {
		this.defense = defense;
	}

	// ステータスをコンソールに表示するメソッド

	public void displayStatus() {
		System.out.println("こんにちは「" + getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getAttack());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDefense());
		System.out.println();
	}
}
