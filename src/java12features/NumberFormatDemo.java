package java12features;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {

		
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));
		format=NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
		System.out.println(format.format(1000));
		System.out.println(format.format(1000000));
		//unicode characters
		
		System.out.println("\u265A");
	}

}
