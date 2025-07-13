package Curriculum_27_logic;

public class Panda extends Animal {
	
	private String scientificName = "アイルロポダ・メラノレウカ";

	public Panda(String name, double speed, int weight) {
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
