package Curriculum_Animal;

//時間を取得し、整形するためにimport
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		//Dog.javaからコンストラクタを呼び出して、インスタンスを生成
		Dog myDog = new Dog();
		Dog myDog2 = new Dog(1);

		//犬の名前と匹数をコンソールに出力
		System.out.println("犬の名前は" + myDog.name + ("です。"));
		System.out.println("犬は" + myDog2.num + ("匹です。"));

		//現在の日時を取得
		LocalDateTime now = LocalDateTime.now();

		//日時の見やすく整形
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");

		//整形した日時を文字列に変換
		String formattedDateTime = now.format(formatter);

		//現在の日時を出力
		System.out.println("現在の日時: " + formattedDateTime);

	}

}
