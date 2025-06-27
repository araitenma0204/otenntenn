package Curriculum_Animal;

// 犬を表すクラス
public class Dog {

	// 犬の名前を格納するフィールド（変数）
	String name;
	
	// 犬の数を格納するフィールド
	int num;

	// 引数なしのコンストラクタ（犬の名前を"キイ"に初期化）
	public Dog() {
		name = "キイ";
	}

	// 引数ありのコンストラクタ（犬の数を指定して初期化）
	public Dog(int num) {
		this.num = num;
	}

	// 犬の名前を取得するメソッド（getter）
	public String getName() {
		return name;
	}
}
