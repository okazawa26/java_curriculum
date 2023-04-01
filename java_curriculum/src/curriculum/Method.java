package curriculum;

public class Method {

	public static void main(String[] args) {
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		hello();

		// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		int num = calc(1);
		System.out.println(num);

		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		int result1 = calc2(2, 3);
		System.out.println(result1);

		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
		double result2 = calc2(2.0, 3.0);
		System.out.println(result2);

		System.out.println(" ");

		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		int[] randomNumbers = RandomNumbers(3);
		for (int number : randomNumbers) {
			System.out.println(number);
		}

		// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
		//     配列の要素の平均値を返すメソッド（関数）を作成してください。	       
		double avg = Avg(randomNumbers);{
			System.out.println(avg);
		}
	}

	public static void hello() {
		System.out.println( "Hello java");
	}

	public static int calc(int num) {
		int result = num + 1;
		return result;
	}

	public static int calc2(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public static double calc2(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}

	public static int[] RandomNumbers(int count) {
		int[] randomNumbers = new int[count];
		for (int i = 0; i < count; i++) {
			randomNumbers[i] = (int) (Math.random() * 100) + 1;
		}
		return randomNumbers;
	}

	public static double Avg(int[] numbers) {
		double sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum / numbers.length;
	}
}






