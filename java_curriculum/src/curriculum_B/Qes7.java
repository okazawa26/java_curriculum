package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// スキャナーを生成
		Scanner scanner = new Scanner(System.in);

		// 生徒の人数を入力するメッセージ
		System.out.print("生徒の人数を入力してください(2以上) : ");

		// 生徒の人数を受け取り変数に代入
		int studentCount = scanner.nextInt();

		// 生徒の人数が2未満の場合
		while (studentCount < 2) {

			// 再入力のメッセージ
			System.out.println("2人以上で再入力してください : ");

			//再入力された生徒の人数を受け取り変数に代入
			studentCount =  scanner.nextInt();


		}

		// 各教科を配列に格納
		String[] subjects = {"英語", "数学", "理科", "社会"};

		// 生徒の人数と科目の数に応じた二次元配列を作成
		double[][] grades = new double[studentCount][subjects.length];

		// 生徒の人数をループ
		for (int i = 0; i < studentCount; i++) {

			// 各教科をループ
			for (int j = 0; j < subjects.length; j++) {

				// 点数を入力させるメッセージ
				System.out.printf("%d人目の「%s」の点数を入力してください：", i + 1, subjects[j]);

				// 点数を受け取り配列に格納
				grades[i][j] = scanner.nextDouble();

			}

			// 改行
			System.out.printf("\n");
		}

		// 生徒の人数をループ
		for (int i = 0; i < studentCount; i++) {

			// 各教科の合計点を計算するための変数を定義
			double subjectSum = 0;

			// 各教科をループ
			for (int j = 0; j < subjects.length; j++) {

				// 各教科の合計点を加算
				subjectSum += grades[i][j];
			}

			// 各教科の平均点を計算し結果を変数に代入
			double avg = subjectSum / subjects.length;

			// X人目の各教科の平均点を出力
			System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, avg);

		}

		// 改行
		System.out.printf("\n");

		// 各教科をループ
		for (int j = 0; j < subjects.length; j++) {

			// 各教科の合計点を計算するための変数を定義
			double subjectSum = 0;

			// 生徒の人数をループ
			for (int i = 0; i < studentCount; i++) {

				// 各教科の合計点を加算
				subjectSum += grades[i][j];
			}

			// 各教科の平均点を計算し結果を変数に代入
			double avg = subjectSum / studentCount;

			// 各教科の平均点を出力
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], avg);

		}

		// 全体の合計点を計算するための変数を定義
		double totalSum = 0;

		// 生徒の人数をループ
		for (int i = 0; i < studentCount; i++) {

			// 各教科をループ
			for (int j = 0; j < subjects.length; j++) {

				// 各生徒の各科目の点数を加算
				totalSum += grades[i][j];
			}
		}

		// 全体の平均点を計算
		double totalAvg = totalSum / (studentCount * subjects.length);

		// 全体の平均点を出力
		System.out.printf("全体の平均点は%.2f点です。\n", totalAvg);

		// スキャナーを閉じる
		scanner.close();
	}
}




