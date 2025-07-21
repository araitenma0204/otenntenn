package curriculum_33;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		//carとbicycleのインスタンス生成
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());	

		// 購入処理
		// person1がcarを購入

		person1.buy(car);

		// person2がbicycleを購入

		person2.buy(bicycle);

	}

}