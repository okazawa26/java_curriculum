package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//Q1 下記9個をローカル変数として宣言のみしてください
		//	・バイト型・短整数型・整数型・長整数型
		//	・単精度浮動小数点数型・倍精度浮動小数点数型
		//	・文字型・文字列型
		//	・ブーリアン型

		// バイト型の変数を宣言 
		byte by;
		// 短整数型の変数を宣言
		short s;
		//	整数型の変数を宣言
		int i;
		// 長整数型の変数を宣言
		long l;
		// 単精度浮動小数点数型の変数を宣言
		float f;
		// 倍精度浮動小数点数型の変数を宣言
		double d;
		// 文字型の変数を宣言
		char c;
		// 文字列型の変数を宣言
		String str;
		// ブーリアン型の変数を宣言
		boolean b;

		//Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください

		//	バイト型の変数に初期値を代入し初期化
		by = 0;
		// 短整数型の変数に初期値を代入し初期化
		s = 0;
		//	整数型の変数に初期値を代入し初期化
		i = 0;
		//	長整数型の変数に初期値を代入し初期化
		l = 0L;
		//	単精度浮動小数点数型の変数に初期値を代入し初期化
		f = 0.0f;
		//	倍精度浮動小数点数型の変数に初期値を代入し初期化
		d = 0.0d;
		//	文字型の変数に初期値を代入し初期化
		c = '\u0000';
		//	文字列型の変数に初期値を代入し初期化
		str = null;
		//	ブーリアン型の変数に初期値を代入し初期化
		b = false;

		//Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		// バイト型byに10を代入
		by = 10;
		// 短整数型sに100を代入
		s = 100;
		// 整数型iに1000を代入
		i = 1000;
		// 長整数型lに10000を代入
		l = 10000L;
		// 単精度浮動小数点数型	fに9.5を代入
		f = 9.5f;
		// 倍精度浮動小数点数型dに10.5を代入
		d = 10.5;
		// 文字型cにaを代入
		c = 'a';
		// 文字列型strにハローを代入
		str = "ハロー";
		// ブーリアン型bにtrueを代入
		b = true;

		//	Q4 下記の通りにコンソール出力されるようにしてください
		//	上記で作成した変数を必ず使用すること

		//	変数by 変数s 変数i 変数l を足して11110を出力
		System.out.println(by + s + i + l);
		//	変数f 変数d を足して変数totalに代入
		double total = (f + d);
		// int型に変換して20を出力
		System.out.println((int)total);
		//	変数c 変数str 変数bを結合してa ハロー trueを出力
		System.out.println(c + " " + str + " " + b);
		//	変数by 変数s 変数i 変数l 変数f 変数dを足し、小数点を切り捨てて11130を出力
		System.out.println(String.format("%.0f", by + s + i + l + f + d));
		//	変数by 変数s 変数i 変数lをかけて10000000000を出力
		System.out.println(by * s * i * l);
		//	変数d 変数sを割って0.105を出力
		System.out.println(d / s);
		//	変数by 変数sを引いて-90を出力
		System.out.println(by - s + "\n");

		//	Q5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//	「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		//	String num="20";
		//	int num1=23;
		//	System.out.println("ハローJAVA"+(num+num1));

		// 文字列型numを整数型に修正
		int num= 20;
		int num1=23;
		// ハローJAVA、num、num1を結合して出力
		System.out.println("ハローJAVA"+(num+num1) + "\n");

		// Q6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		//	↓↓format↓↓
		// 「初めまして○○です」
		//	「年齢は○○歳です」
		//	「身長は○○cmです」
		//	「体重は○○kgです」
		//	「好きな食べ物は○○です」

		// String型nameに山田太郎を代入
		String name = "山田太郎";
		// int型ageに18を代入
		int age = 18;
		//	double型heightに170.5を代入
		double height = 170.5;
		//	double型weightに62.2を代入
		double weight = 62.2;
		// String型favoriteFoodに寿司を代入
		String  favoriteFood = "寿司";

		// 変数nameを出力
		System.out.println("初めまして" + name + "です");
		// 変数ageを出力
		System.out.println("年齢は" + age + "歳です");
		// 変数heightを出力
		System.out.println("身長は" + height + "cmです");
		// 変数weightを出力
		System.out.println("体重は" + weight + "kgです");
		// 変数favoriteFoodを出力
		System.out.println("好きな食べ物は" + favoriteFood + "です" + '\n');


		//	Q7 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		//	「BMIは○○です」
		//	ただし計算は数値を直書きせず、全て変数を使ってすること

		// double型変数heightMに身長÷100を代入
		double heightM = height / 100;
		// double型変数bmiにBMIの計算を代入
		double bmi = weight / (heightM * heightM);
		// BMIを小数点第一まで出力
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です" + "\n");

		//	Q8 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です

		// 変数nameに鈴木一郎を再代入
		name = "鈴木一郎";
		// 変数ageに24を再代入
		age = 24;
		// 変数heightに168.5を再代入
		height = 168.5;
		// 変数weightに64.2を再代入
		weight = 64.2;
		// 変数favoriteFoodにオムライスを再代入
		favoriteFood = "オムライス";
		// BMIを計算
		heightM = height / 100;
		bmi = weight / (heightM * heightM);

		// 再代入した変数nameを出力
		System.out.println("初めまして" + name + "です");
		// 再代入した変数ageを出力
		System.out.println("年齢は" + age + "歳です");
		// 再代入した変数heightを出力
		System.out.println("身長は" + height + "cmです");
		// 再代入した変数weightを出力
		System.out.println("体重は" + weight + "kgです");
		// 再代入した変数favoriteFoodを出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		// BMIを小数点第一まで出力
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です" + "\n");

		//	Q9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		//	初めまして鈴木一郎です
		//	年齢は48歳です
		//	身長337.0cmです
		//	体重は128.4kgです
		//	好きな食べ物はオムライスです
		//	BMIは11.31です

		// 変数ageの数値を和算で自己代入
		age += age;
		// 変数heightの数値を和算で自己代入
		height += height;
		// 変数weightの数値を和算で自己代入
		weight += weight;
		// BMI計算
		// cmをmに変換
		heightM = height / 100;
		// BMIを計算
		bmi = weight / (heightM * heightM);

		// 変数nameを出力
		System.out.println("初めまして" + name + "です");
		// 自己代入した変数ageを出力
		System.out.println("年齢は" + age + "歳です");
		// 自己代入した変数heightを出力
		System.out.println("身長は" + height + "cmです");
		// 自己代入した変数weightを出力
		System.out.println("体重は" + weight + "kgです");
		// 変数favoriteFoodを出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		// BMIを小数点第二位まで出力
		System.out.println("BMIは" + String.format("%.2f", bmi) + "です" + "\n");
		
		//	Q10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません

		// 関係演算子を使って年齢が25歳以上の時trueを出力
		System.out.println((age >= 25) + "\n");

		//	Q11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください

		// int型ageを文字列型に型変換しString型変換ageStrに代入
		String ageStr = String.valueOf(age);
		// double型heightを文字列型に型変換しString型変換heightStrに代入
		String heightStr = String.valueOf(height);
		// double型weightを文字列型に型変換しString型変換weightStrに代入
		String weightStr = String.valueOf(weight);

		System.out.println(ageStr + heightStr + weightStr + "\n");

		//	Q12 11で変換した【年齢・身長】を整数型に変換して出力してください

		// 11で変換したString型ageStrをint型に変換して変数ageIntに代入
		int ageInt = Integer.parseInt(ageStr);
		// 11で変換したString型heightStrをint型に変換して変数heightIntに代入
		int heightInt = (int)Double.parseDouble(heightStr);
		// int型に変換した変数ageIntを出力
		System.out.println(ageInt);
		// int型に変換した変数heightIntを出力
		System.out.println(heightInt + "\n");

		//	Q13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		//	ただしif文は使わないでください
		// 論理演算子||を使ってageInt(年齢)が25もしくはheightInt(身長)が160以上の場合trueを出力
		System.out.println(ageInt >= 25 || heightInt >= 160);













	}

}
