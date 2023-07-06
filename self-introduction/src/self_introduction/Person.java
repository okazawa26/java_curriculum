package self_introduction;
/*
問題1：インスタンスフィールドを定義してください

問題2：コンストラクタを定義してください（name,age,height それぞれの引数）

問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください

問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）

問題5：Main.javaの引数にweightの60を入れてください

問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）

問題7：bmiメソッドでインスタンスのBMIを返すようにしてください

問題8：インスタンスメソッド「print」を定義してください（戻り値：void）

問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください

問題10：人数の合計を「合計○人です」と出力してください。
 */

public class Person {

	// インスタンスフィールドを定義
	public String name;

	public int age;

	public double height;

	public double weight;

	// クラスフィールド
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {

		this.name = name;

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

		System.out.println("\n「名前は" + this.name + "です」");

		System.out.println("「年は" + this.age + "才です」");

		// BMIを小数点第一まで出力
		System.out.println("「BMIは" + String.format("%.1f", this.bmi()) + "です」");

	}

	// 人数(インスタンス数)を出力するメソッド
	public static void printCount() {
		System.out.println("「合計" + Person.count + "人です」");
	}
}
