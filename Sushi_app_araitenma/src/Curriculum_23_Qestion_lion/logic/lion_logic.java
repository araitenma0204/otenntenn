package Curriculum_23_Qestion_lion.logic;

public class lion_logic {

	//フィールドを定義
	private String animal;
	private double length;
	private int speed;

	//空のコンストラクタ
	//コンストラクタを初期化はセッターを使用して別クラスで

	public lion_logic() {
	}

	// --- Getter ---
	public String getAnimal() {
		return this.animal;
	}

	public double getLength() {
		return this.length;
	}

	public int getSpeed() {
		return this.speed;
	}

	// --- Setter ---
	//実行用のクラスで変数を変更可能に
	public void setAnimal(String animal) {
		if (animal != null && !animal.isEmpty()) {
			this.animal = animal;
		} else {
			System.out.println("動物名は null または空文字にできません。");
		}
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 表示用メソッド
	public void showInfo() {
		System.out.println("動物名：" + this.getAnimal());
		System.out.println("体長：" + this.getLength() + "m");
		System.out.println("速度：" + this.getSpeed() + "km/h");
	}
}

//
//下記がコンソールに出力されるように作成してください
//※thisとsetterとgetterとフィールドを使ってください
//
//動物名：ライオン
//体長：2.1m
//速度：80km/h
