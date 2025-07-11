package Curriculum_22_Qestion_sushiapp;

//処理用クラスをimport

import Curriculum_22_Qestion_sushilogic.Sushi_logic;

public class Sushi_app {

	// Javaプログラムのスタート地点 mainメソッド
	
	public static void main(String[] args) {
		
		// Sushi_logicクラスのインスタンスを作成（処理用クラスの呼び出し）

		Sushi_logic sushi = new Sushi_logic();
		
		// 作成したインスタンスのメソッドdisplayInfoを呼んで画面に表示させる
		sushi.displayInfo();

	}
}
