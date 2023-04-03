package curriculum;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog();
		System.out.println(dog1.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(3);
		System.out.println(dog2.animalCount);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		System.out.println(sdf.format(cal.getTime()));
		
	}
}
