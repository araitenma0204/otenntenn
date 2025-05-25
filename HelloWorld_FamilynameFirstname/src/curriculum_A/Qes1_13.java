package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		// Q_1 変数を宣言
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String st;
		boolean bo;

		// Q_2
		// それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化

		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0;
		c = '\u0000';
		st = "";
		bo = false;

		// Q_3
		// 変数に指定の値を代入

		b = 10;
		s = 100;
		i = 1000;
		l = 10000l;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		st = "ハロー";
		bo = true;
		// Q_4
		// 計算結果や結合結果の出力

		System.out.println(b + s + i + l);
		System.out.println(b + b);
		System.out.println(c + st + bo);
		System.out.println(l + i + s + b + b + b);
		System.out.println(l * i * s * b);
		System.out.println(d / s);
		System.out.println(b - s);

		// Q5
		// 数値の加算

		int num = 20;
		int num1 = 23;

		// 結合結果の出力

		System.out.println("ハローJAVA" + (num + num1));

		// Q_6
		// 自己紹介の情報を変数に代入

		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";

		// 自己紹介の出力

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢" + age + "歳です");
		System.out.println("身長" + height + "cmです");
		System.out.println("体重" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");

		// Q_7
		// BMI計算（身長をメートルに変換 → BMI計算式：体重 ÷ (身長×身長)）

		double heightM = height / 100;
		double rawBmi = weight / (heightM * heightM);

		// BMIの出力

		System.out.println("BMIは" + rawBmi + "です");

		// Q_8
		// 自己紹介の値を再代入

		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		heightM = height / 100;
		rawBmi = weight / (heightM * heightM);

		//自己紹介＋BMIを出力

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢" + age + "歳です");
		System.out.println("身長" + height + "cmです");
		System.out.println("体重" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", rawBmi) + "です");

		// Q_9
		// 自己代入で変数を変更

		age += age;
		height += height;
		weight += weight;
		heightM = height / 100;
		rawBmi = weight / (heightM * heightM);

		// 自己代入する際などに変数を使うことを意識する。
		// 自己代入で変更した変数の出力

		System.out.println("年齢" + (age) + "歳です");
		System.out.println("身長" + (height) + "cmです");
		System.out.println("体重" + (weight) + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.2f", rawBmi) + "です");

		// Q_10
		//8で使用した年齢が25歳以上ならtrueが出力されるよう出力。ただしif文は使いません

		System.out.println(age >= 25);

		// Q_11

		// 年齢、身長、体重を再代入でQ_8の状態に戻す

		age = 24;
		height = 168.5;
		weight = 64.2;

		//8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力

		String strage = String.valueOf(age);
		String strheight = String.valueOf(height);
		String strweight = String.valueOf(weight);

		System.out.println(strage + strheight + strweight);

		// Q_12
		// 11で変換した【年齢・身長】を整数型に変換して出力。
		//ageは小数点がないためそのまま文字列から整数に変換可能
		// heightは小数点有りの文字列の為 double(数値) に変換

		int intage = Integer.parseInt(strage);
		double doubleHeight = Double.parseDouble(strheight);
		int intheight = (int) doubleHeight;

		System.out.println(intage);
		System.out.println(doubleHeight);

		// Q_13
		//12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		System.out.println(intage >= 25 || doubleHeight >= 160);
	}
}
