package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// 外側のループ 1～9までの整数iを回す
		for (int i = 1; i <= 9; i++) {
			// 内側のループ 1～9までの整数jを回す
			for(int j = 1; j <= 9; j++) {
				// iとjの掛け算の結果を変数に代入
				int result = i* j;
				// 掛け算の結果が10未満の時、結果の前に0をつけて出力
				if (result < 10) {
					System.out.printf("%02d * %02d = %02d", i , j , result);
					// 掛け算の結果が10以上の時、結果をそのまま出力
				} else {
					System.out.printf("%02d * %02d = %d", i , j , result);
				}
				// jが9以外の式とき、|| を出力
				if (j != 9) {
					System.out.print(" || ");
				}
			}
			// ループ最後に改行
			System.out.println();
		}
	}
}

