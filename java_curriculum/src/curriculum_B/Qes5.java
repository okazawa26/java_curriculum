package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {

		// I * J = Z の式
		// 外側のループI 1～9まで回す
		for (int i =1; i <= 9; i++) {

			// 内側のループJ 1～20まで回す
			for (int j = 1; j <= 20; j++) {


				// IとJの掛け算の結果を変数に代入

				int result = i * j;


				// 内側のループが20以外のとき、「  ||  」を出力
				if (j < 20) {

					// 三桁で出力
					System.out.printf("%03d * %03d = %03d  ||  ", j, i, result);

					// 内側のループが20のとき改行
				} else {

					// 三桁で出力
					System.out.printf("%03d * %03d = %03d\n", j, i, result);


				}
			}
		}
	}
}