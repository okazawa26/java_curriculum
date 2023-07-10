package self_introduction;

public class Main {

	public static void main(String[] args) {

		// インスタンス生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);

		// 名前、歳、BMIを出力するメソッドの呼び出し
		person1.print();

		// インスタンス生成
		Person person2 = new Person("山田", "花子", 20, 1.7, 60);

		// 名前、歳、BMIを出力するメソッドの呼び出し
		person2.print();

		// countの値を出力
		System.out.println("「合計" + Person.count + "人です」");
		
		// 人数(インスタンス数)を出力するメソッドの呼び出し
		Person.printCount();

		// インスタンス生成
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// オーナーを設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());

		// オーナの名前を出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner() + "\n");

		// buyメソッド呼び出し
		person1.buy(car);
		person2.buy(bicycle);



	}
}
