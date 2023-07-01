package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import animal.Animals;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 各動物の情報をマップに追加
		Map<String, Animals> animalMap = new HashMap<>();

		animalMap.put("ライオン:2.1:80", new Animals(2.1, 80, "パンテラ レオ"));

		animalMap.put("ゾウ:3.2:40", new Animals(3.2, 40, "ロキソドンタ・サイクロティス"));

		animalMap.put("パンダ:1.9:30", new Animals(1.9, 30, "アイルロポダ・メラノレウカ"));

		animalMap.put("チンパンジー:0.94:25", new Animals(0.94, 25, "パン・トゥログロディテス"));

		animalMap.put("シマウマ:2.4:65", new Animals(2.4, 65, "チャップマンシマウマ"));

		animalMap.put("インコ:0.1:50", new Animals(0.1, 50, "不明"));


		System.out.print("コンソールに文字を入力してください : ");

		String input = scanner.nextLine();

		scanner.close();

		//入力された文字列をカンマで分割し、動物の名前の配列を作成
		String[] animalNames = input.split(",");

		// 動物の名前の配列をループして各動物の情報を出力
		for (String animalName : animalNames) {

			// マップから動物の情報を取得
			Animals animals = animalMap.get(animalName);

			if (animals != null) {

				// 入力文字列をコロンで分割
				String[] animalInfo = animalName.split(":");

				// 動物の名前を取得
				String name = animalInfo[0];

				System.out.println("動物名：" + name);

				System.out.println("体長：" + animals.getLength() + "m");

				System.out.println("速度：" + animals.getSpeed() + "km/h");

				System.out.println("学名：" + animals.getScientificName() + "\n");

			} else {

				System.out.println("入力された動物名に対応する情報はありません");
			}
		}
	}
}
