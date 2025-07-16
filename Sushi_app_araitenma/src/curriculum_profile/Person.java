package curriculum_profile;

public class Person {

	private static int count = 0;
	private String name;
	private int age;
	private double height;
	private double weight;

	public Person(String name, int age, double height, double weight) {
		this.setName(name);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		count++;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double bmi() {
		return getWeight() / (getHeight() * getHeight());
	}

	public void print() {
		System.out.println("名前は" + this.getName() + "です");
		System.out.println("年は" + this.getAge() + "です");
		System.out.printf("BMIは%.2fです\n", this.bmi());
	}

	public static void printTotal() {
		System.out.println("合計" + count + "人です");
	}

}
