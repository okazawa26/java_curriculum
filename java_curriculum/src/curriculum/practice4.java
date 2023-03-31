
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package curriculum;

public class practice4 {

	public static void main(String[] args) {
		String[] str = {"a", "b" ,"c", "d", "e", "f", "g", "h", "i", "j"};
//		brake文を使用し、a～dまで表示してください。
		for (int i = 0;  i < str.length; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(str[i]);
		}
		System.out.println(" ");

//		cotinue文を使用し、i以外を表示してください。
		for(int i = 0; i < str.length; i++) {
			if (i == 8) {
				continue;
			}
			System.out.println(str[i]);
		}
	}
}

