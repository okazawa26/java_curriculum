package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
//		入力した商品の残り台数が出力されるシステムを下記の条件で作成してください	
			//	・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可	
			//	・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください	
			//	・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 	
			//	・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字	
			//	・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません	
			//	・入力された値は「、」区切りで指定してください	
			//	・そのほかの値が入力された場合下記を出力されるようにしてください	
			//	『受け取った値』は指定の商品ではありません
			//	・残り台数は0〜11までのランダムな値が出力されるようにしてください	

			//	入力例↓↓
			//	パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品
			//	出力例↓↓
			//	パソコンの残り台数は8台です
			//	冷蔵庫の残り台数は7台です
			//	扇風機の残り台数は7台です
			//	洗濯機の残り台数は10台です
			//	加湿器の残り台数は3台です
			//	テレビの残り台数は9台です
			//	ディスプレイの残り台数は2台です
			//『 その他商品 』は指定の商品ではありません
		
		
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
				System.out.println(product + "の残り台数は" + randomProducts + "台です\n");

				// ケースの実行を終了
				break;

			// 以下の商品名が入力された場合、その商品の残り台数を出力
			case "テレビ":
			case "ディスプレイ":

				// ディスプレイの場合、最大個数11からランダムで生成された数値を引く
				// テレビの場合はそのままランダムな数値を変数に代入
				int productCount = (product.equals("ディスプレイ")) ? (11 - tvAndDisplayCount) : tvAndDisplayCount;

				// 残り台数のメッセージを出力
				System.out.println(product + "の残り台数は" + productCount + "台です\n");

				// ケースの実行を終了
				break;

			// 指定された商品名が上記のどれにも当てはまらない場合
			default:

				// 指定された商品が存在しない場合のメッセージを出力
				System.out.println("『" + product + "』は指定の商品ではありません\n");
			}
		}
	}
}
