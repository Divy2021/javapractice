package ArrayandNumbersPractice;

public class ReverseAddPalindrome {

//	Reverse and add until you get a palindrome
// --https://javaconceptoftheday.com/how-to-reverse-and-add-number-until-you-get-palindrome/
//	Write a Java program to take input number from the user, reverse it and add it to itself. If the sum is not a palindrome then repeat the procedure until you get a palindrome.

	public static void main(String[] args) {

		int num = 23242;

		if (isPalindrome(num))
			System.out.println("num is already a palindrome");
		else {
			int reverse = num;
			while (!isPalindrome(reverse)) {
				reverse = reverse + reverse(reverse);
			}
			System.out.println("num -> " + num + " and reverse after additon -> " + reverse);
		}
		// num and reverse after addition 7235 and 497794
	}

	public static boolean isPalindrome(int num) {
		if (num == reverse(num))
			return true;
		else
			return false;
	}

	public static int reverse(int num) {
		int rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;

	}

}
