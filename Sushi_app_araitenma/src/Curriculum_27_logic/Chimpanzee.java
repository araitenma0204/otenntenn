package Curriculum_27_logic;

public class Chimpanzee extends Animal {
	
	private String scientificName = "パン・トゥログロディテス";

	public Chimpanzee(String name, double speed, int weight) {
		super(name, speed, weight); // Animalクラスのコンストラクタ
	}

	@Override
	public void display() {
		System.out.println(
				"動物: " + getName() + " 時速: " + getSpeed() + "k/h 重量: " + getWeight() + "kg 学術名: " + scientificName);
	}
	//Animalクラスを継承してlionの情報にオーバーライド済み
	//他子クラス作る際はパンテラレオの部分だけ変更で可能

}
