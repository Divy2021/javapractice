package ArrayandNumbersPractice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//370->27+49*7=343

		int num = 153; // order is 4 for 1634 -> 1^4 + 6^4 + 3^4 + 4^4
		int num1 = num;
		int order = 0;
		int div = 0;
		while (num > 0) {
			div = num % 10;
			num = num / 10;
			order++;
		}

		System.out.println("order is :" + order);

		int i = 0;
		int result = 0;
		while (i < order) {
			div = num1 % 10;
			int res = 1;
			for (int j = 1; j <= order; j++) {
				res *= div;
				System.out.println("div :" + i + "th number" + res);
			}
			// System.out.println("div :"+i+"th number"+div);
			num1 = num1 / 10;
			result += res;
			i++;
		}
		// armstrong number is sum of cube roots(if the number has 3 digits) of each
		// digit is equal to actual number i.e) 153 ==> 1+125+27 ->1^3+5^3+3^3
		System.out.println("result :" + result);
	}
}
