package curriculum_profile3;

public class Person {
	private static int count = 0;
	private String firstName;
	private String lastName; //フィールドに追加
	private int age;
	private double height, weight;

	// コンストラクタ1
	public Person(String firstName, int age, double height, double weight) {
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// コンストラクタのオーバーロード
	// 引数にString lastNameを追加
	// this.lastName = lastName;を追加
	// Person.count++;を追加
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	// fullNameメソッド
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// printメソッド
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// bmi計算メソッド
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// staticメソッド
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	// ここからgetterとsetter追加

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
