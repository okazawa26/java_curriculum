package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {

		// 外側のループ 1～9まで回す
		for (int i =1; i <= 9; i++) {

			// 内側のループ 1～20まで回す
			for (int j = 1; j <= 20; j++) {

				// iとjの掛け算の結果を変数に代入

				int result = i * j;
				

				// 結果が3桁以上ならそのまま出力し、1桁しかない場合は0をつけて3桁で出力
				 // 内側のループの整数が20以外の時 || を出力し、整数が20であれば改行する
				System.out.printf("%03d * %03d = %03d%s", j , i , result, (j != 20 ? " || " : "\n"));
				
				
			}
		}
	}
}