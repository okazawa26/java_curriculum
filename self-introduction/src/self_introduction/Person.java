package self_introduction;
/*
1.33 自己紹介プログラムを作成③

問題1：インスタンスフィールドに「lastName」を追加しましょう

問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください ※順番はfirstNameの次

問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
 */

public class Person {
	// クラスフィールド
	public static int count = 0;

	// インスタンスフィールドを定義
	public String firstName;

	public String lastName;

	public int age;

	public double height;

	public double weight;


	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstName, String lastName, int age, double height, double weight) {

		this.firstName = firstName;

		this.lastName = lastName;

		this.age = age;

		this.height = height;

		this.weight = weight;

		// クラスフィールドをインクリメント
		Person.count++;
	}

	// bmiメソッド
	public double bmi() {

		// bmiの計算結果を返す
		return weight / (height * height);
	}

	// 名前、歳、BMIを出力するメソッド
	public void print() {

		System.out.println("「名前は" + this.fullName() + "です」");

		System.out.println("「年は" + this.age + "才です」");

		// BMIを小数点第一まで出力
		System.out.println("「BMIは" + String.format("%.1f", this.bmi()) + "です」\n");

	}

	// 人数(インスタンス数)を出力するメソッド
	public static void printCount() {
		System.out.println("「合計" + Person.count + "人です」");
	}

	// フルネームメソッド
	public String fullName() {
		String fullName = this.firstName + this.lastName;
		return fullName;
	}
}
