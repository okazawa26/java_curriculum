package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// 外側のループ 1～9まで回す
		for (int i =1; i <= 9; i++) {
			// 内側のループ 1～20まで回す
			for (int j = 1; j <= 20; j++) {
				// iとjの掛け算の結果を変数に代入
				int result = i * j;
				// 計算結果が100未満の時(結果が三桁に満たないとき)0で埋めて出力
				if (result < 100){
					System.out.printf("%03d * %03d = %03d", j , i , result);
					// 結果が100以上の時は答えをそのまま出力
				} else {
					System.out.printf("%03d * %03d = %d", j , i , result);
				}
				// 内側のループ jが20以外の時、 || を出力
				if (j != 20) {
					System.out.print(" || ");
				}
			}
			// ループの最後に改行
			System.out.println();
		}
	}
}
