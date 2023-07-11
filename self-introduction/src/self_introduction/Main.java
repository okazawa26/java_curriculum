package self_introduction;

class Main{
	public static void main(String[] args){

		// インスタンス生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);

		// 名前、歳、BMIを出力
		person1.print();

		// インスタンス生成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// 名前、歳、BMIを出力
		person2.print();

		// 合計人数を出力
		Person.printCount();
	}
}
