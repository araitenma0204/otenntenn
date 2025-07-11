package Curriculum_23_Qestion_lion.app;

//lion_logicクラスをインポート

import Curriculum_23_Qestion_lion.logic.lion_logic;

public class lion_app {

	public static void main(String[] args) {

		//コンストラクタをインスタンス化

		lion_logic lion = new lion_logic();
		
		//セッターを使用し値をセット
		
		lion.setAnimal("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		//メソッドを呼び出し

		lion.showInfo();

	}

}
