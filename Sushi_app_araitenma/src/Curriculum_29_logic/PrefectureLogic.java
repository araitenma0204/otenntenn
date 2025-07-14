package Curriculum_29_logic;

public class PrefectureLogic {
	
	//フィールドの定義

	private String name;
	private String capital;
	private double area;
	
	//コンストラクタの初期化

	public PrefectureLogic(String name, String capital, double area) {

		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	//	ゲッター
	
	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}

	//表示用のメソッド
	public void display() {
		System.out.println("都道府県名：" + name);
		System.out.println("県庁所在地：" + capital);
		System.out.println("面積：" + area + "km2");
		System.out.println();
	}

}
//関西だけでやりたかったら子クラス作ってオーバーライドもありかな？
