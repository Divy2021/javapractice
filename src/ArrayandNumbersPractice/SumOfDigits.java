package ArrayandNumbersPractice;

public class SumOfDigits {

	public static void main(String[] args) {

		int num = 12345;

		// 1+2+3+4=10
		// 1234/10->4 >123/10-> 12/10->2
		int result = 0;
		int digit = 0;
		while (num > 0) {
			digit = num % 10;
			result += digit;
			num = num / 10;// result=result+div;
		}

		System.out.println("Sum of all digits -> " + result);
	}
}
