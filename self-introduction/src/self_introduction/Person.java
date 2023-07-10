package self_introduction;
/*
1.32 自己紹介プログラムを作成②

問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）

問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください

問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。

問題4：クラスメソッド「printCount」を定義してください（データ型：void）

問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください

問題6：クラスメソッド「printCount」を呼び出してください
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
		System.out.println("「合計" + Person.count + "人です」\n");
	}

	// フルネームメソッド
	public String fullName() {
		String fullName = this.firstName + this.lastName;
		return fullName;
	}

	// 車のbuyメソッドを定義
	public void buy(Car car) {

		car.setOwner(this.fullName());

		System.out.println(car.getOwner() + "が購入しました");
	}

	// 自転車のbuyメソッドを定義
	public void buy(Bicycle bicycle) {

		bicycle.setOwner(this.fullName());

		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
