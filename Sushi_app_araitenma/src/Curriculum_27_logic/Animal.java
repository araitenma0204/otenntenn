package Curriculum_27_logic;

// 動物の基本情報を持つ親クラス

public class Animal {

	// フィールド（動物の名前、速度、重量）
	
	private String name;
	private double speed;
	private int weight;

	// 空のコンストラクタ（引数なし）
	
	public Animal() {
		
		// 必要に応じて初期値を設定できる
		
	}

	// 引数ありコンストラクタ（名前、速度、重量をセット）
	
	public Animal(String name, double speed, int weight) {
		this.name = name;
		this.speed = speed;
		this.weight = weight;
	}

	// --- Getter メソッド ---
	
	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public int getWeight() {
		return weight;
	}

	// --- Setter メソッド ---
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// 動物の情報をコンソールに表示するメソッド
	
	public void display() {
		System.out.println("動物: " + name + " 時速: " + speed + "k/h 重量: " + weight + "kg");
	}
}
