package main;

import java.util.Scanner;

import inheritance2.Hero;

public class Main {

	public static void main(String[] args) {
		
		// スキャナーインスタンス生成
		Scanner scanner = new Scanner(System.in);
		
		// ヒーローインスタンス生成
		Hero hero = new Hero();
		
		System.out.print("名前を入力してください：");
		
		// 名前を受け取り変数に格納
		String name = scanner.nextLine();
		
		// 入力された名前をヒーローインスタンスのフィールドに設定
		hero.setName(name);
		
		// ステータスを表示するメソッドを呼び出し
		hero.printStatus();
		
		scanner.close();
	}

}
