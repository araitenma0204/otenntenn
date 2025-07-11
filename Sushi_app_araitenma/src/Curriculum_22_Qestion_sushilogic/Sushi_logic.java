package Curriculum_22_Qestion_sushilogic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sushi_logic {

	// フィールド（変数）を用意

	private String greeting;
	private String sushiTaste;
	private String cuisineType;
	private String currentDate;

	// コンストラクタでthisを使って初期化

	public Sushi_logic() {
		this.greeting = "こんにちは！ここは日本です！";
		this.sushiTaste = "この寿司はうまい";
		this.cuisineType = "寿司は和食です";

		// 今日の日付取得

		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		this.currentDate = today.format(formatter);
	}

	// 情報表示用メソッド

	public void displayInfo() {
		System.out.println(this.greeting);
		System.out.println(this.sushiTaste);
		System.out.println(this.cuisineType);
		System.out.println("今の現在日時は" + this.currentDate + "です");
	}
}
