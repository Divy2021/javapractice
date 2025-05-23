package StringsPractice;

public class pyramidofNumber {

	public static void main(String[] args) {

		// ***1***
		// *1 2**
		// 1 2 3**
		int n = 10;
		int rowcount = 1;
		for (int i = n; i > 0; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= rowcount; j++) {
				System.out.print(j + " "); // System.out.print(rowcount+" "); same number in each row
			}
			System.out.println();
			rowcount++;
		}

	}

}
