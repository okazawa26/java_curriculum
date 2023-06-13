package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// スキャナーを生成
		Scanner scanner = new Scanner(System.in);

		// 商品名入力を促すメッセージ
		System.out.print("商品名：");

		// ユーザーが入力した商品名を取得し、変数に代入
		String productName = scanner.nextLine();

		// スキャナーを閉じる
		scanner.close();

		// ユーザーが入力した商品名の文字列を「、」を区切り文字として分割し、それぞれの商品名配列に格納
		String[] products = productName.split("、");

		// ランダムな数字を生成するためのランダムオブジェクトを作成
		Random rand = new Random();

		// テレビとディスプレイの合計が11になるような数値を生成
		int tvAndDisplayCount = rand.nextInt(12);

		// ユーザーが入力したそれぞれの商品名に対して処理を行う
		for (String product : products) {

			// 商品名によって異なる処理を行う
			switch (product) {

			// 以下の商品名が入力された場合、その商品の残り台数を出力
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":

				// 0から11までのランダムな整数を生成する処理を変数に代入
				int randomProducts = rand.nextInt(12);

				// 残り台数のメッセージを出力
				System.out.println(product + "の残り台数は" + randomProducts + "台です");

				// ケースの実行を終了
				break;

			// 以下の商品名が入力された場合、その商品の残り台数を出力
			case "テレビ":
			case "ディスプレイ":

				// ディスプレイの場合、最大個数11からランダムで生成された数値を引く
				// テレビの場合はそのままランダムな数値を変数に代入
				int productCount = (product.equals("ディスプレイ")) ? (11 - tvAndDisplayCount) : tvAndDisplayCount;

				// 残り台数のメッセージを出力
				System.out.println(product + "の残り台数は" + productCount + "台です");

				// ケースの実行を終了
				break;

			// 指定された商品名が上記のどれにも当てはまらない場合
			default:

				// 指定された商品が存在しない場合のメッセージを出力
				System.out.println("『" + product + "』は指定の商品ではありません");
			}
		}
	}
}
