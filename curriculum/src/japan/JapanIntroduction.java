package japan;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JapanIntroduction {
	String HelloJapan;
	String sushi;
	String washoku;
	String dateTimeFormat;

	public JapanIntroduction () {
		this.HelloJapan = "こんにちは！ここは日本です！";
		this.sushi = "この寿司はうまい";
		this.washoku = "寿司は和食です";
		this. dateTimeFormat = "yyyy/MM/dd HH:mm:ss";
	}

	public void introduction()  {
		if (this.HelloJapan != null) {
			System.out.println(this.HelloJapan);
		} else {
			System.out.println("HelloJapanがnullです");
		}

		if (this.sushi != null) {
			System.out.println(this.sushi);
		} else {
			System.out.println("sushiがnullです");
		}

		if (this.washoku != null) {
			System.out.println(this.washoku);
		} else {
			System.out.println("washokuがnullです");
		}
	}

	public void dateTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(this.dateTimeFormat);
		System.out.println("今の現在日時は" + sdf.format(cal.getTime()) + "です");
	}
}
