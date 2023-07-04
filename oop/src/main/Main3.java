package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import prefecture.Prefecture;

public class Main3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 都道府県のリストを定義
		List<Prefecture> prefectures = Arrays.asList(
				new Prefecture("北海道", "札幌市", 83424),
				new Prefecture("青森県", "青森市", 9646),
				new Prefecture("岩手県", "盛岡市", 15275),
				new Prefecture("宮城県", "仙台市", 7282),
				new Prefecture("秋田県", "秋田市", 11638),
				new Prefecture("山形県", "山形市", 9323),
				new Prefecture("福島県", "福島市", 13784),
				new Prefecture("茨城県", "水戸市", 6097),
				new Prefecture("栃木県", "宇都宮市", 6408),
				new Prefecture("群馬県", "前橋市", 6362),
				new Prefecture("埼玉県", "さいたま市", 3798)
				);

		System.out.print("都道府県の番号を入力してください：");

		// 番号を受け取り、カンマで分割
		String[] indices = scanner.nextLine().split(",");

		// リストの初期化
		List<Prefecture> sort = new ArrayList<>();

		for (String index : indices) {

			// 受け取った番号を整数型に変換し、リストから番号に対応する都道府県を取得
			sort.add(prefectures.get(Integer.parseInt(index)));
		}

		System.out.print("昇順か降順を入力してください：");

		// 昇順か降順を取得
		String order = scanner.nextLine();

		// 昇順の場合
		if (order.equals("昇順")) {

			// 面積を昇順でソート
			sort.sort(Comparator.comparingDouble(Prefecture::getArea));

			// 降順の場合
		} else if (order.equals("降順")) {

			// 面積を降順でソート
			sort.sort(Comparator.comparingDouble(Prefecture::getArea).reversed());
		}

		System.out.print("\n");

		// ソートした各都道府県名、県庁所在地、面積を出力
		for (Prefecture p : sort) {

			System.out.println("都道府県名：" + p.getName());

			System.out.println("県庁所在地：" + p.getCapital());

			System.out.println("面積：" + p.getArea() + "km2\n");
		}
		scanner.close();
	}
}
