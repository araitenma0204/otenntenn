package Curriculum_29_logic;

public class KansaiPrefecture extends PrefectureLogic {
	
	public KansaiPrefecture (String name, String capital, double area) {
		super(name, capital, area);	
	}
	
	@Override
	public void display () {
		System.out.println("[関西地方]");
		super.display();
	}
}
