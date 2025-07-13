package Curriculum_27_logic;

public class Elephant extends Animal {
	
	private String scientificName = "ロキソドンタ・サイクロティス";

	public Elephant(String name, double speed, int weight) {
		super(name, speed, weight); // Animalクラスのコンストラクタ
	}

	@Override
	public void display() {
		System.out.println(
				"動物: " + getName() + " 時速: " + getSpeed() + "k/h 重量: " + getWeight() + "kg 学術名: " + scientificName);
	}
	//Animalクラスを継承してlionの情報にオーバーライド済み
	//他子クラス作る際は正式名称とクラス名とメソッド名の部分だけ変更で可能

}
