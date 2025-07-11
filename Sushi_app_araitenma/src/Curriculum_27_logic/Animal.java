package Curriculum_27_logic;

public class Animal {

	private String name;
	private double speed;
	private int weight;

	public Animal() {

	}

	public Animal(String name, double speed, int weight) {
		this.name = name;
		this.speed = speed;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public int getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void display() {
		System.out.println("動物: " + name + " 時速: " + speed + "k/h 重量: " + weight + "kg");
	}
}
