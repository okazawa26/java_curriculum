package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {

		// 外側のループ 1~9までの整数を回す
		for (int i = 1; i <= 9; i++) {

			// 内側のループ 1~9までの整数を回す
			for(int j = 1; j <= 9; j++) {

				// 整数同士の掛け算の結果を変数に代入

				int result = i * j;

				// 結果を2桁以上ならそのまま出力し、1桁しかない場合は先頭に0をつけて2桁で出力
				System.out.printf("%02d * %02d = %02d", i, j, result);


				// 内側のループの整数が9以外のとき || を出力
				if (j != 9) {

					System.out.print(" || ");

				}
			}

			// ループ最後に改行
			System.out.println();

		}
	}
}
