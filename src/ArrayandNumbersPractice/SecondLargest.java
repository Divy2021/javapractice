package ArrayandNumbersPractice;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 63, 65, 13, 20, 19, 22, 24, 25, 27, 26, 1, 2, 3, 4, 5, 6, 64, 7, 8, 11, 12, 9, 51 };
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] >= max2)
				max2 = arr[i];
		}
		System.out.println("largest :" + max1 + " second largest :" + max2);
		// int firstLargest, secondLargest;

		// Checking first two elements of input array
//		 int firstLargest, secondLargest;
//        if(input[0] > input[1])
//        {
//            //If first element is greater than second element
// 
//            firstLargest = input[0];
// 
//            secondLargest = input[1];
//        }
//        else
//        {
//            //If second element is greater than first element
// 
//            firstLargest = input[1];
// 
//            secondLargest = input[0];
//        }
// 
//        //Checking remaining elements of input array
// 
//        for (int i = 2; i < input.length; i++)
//        {
//            if(input[i] > firstLargest)
//            {
//                //If element at 'i' is greater than 'firstLargest'
// 
//                secondLargest = firstLargest;
// 
//                firstLargest = input[i];
//            }
//            else if (input[i] < firstLargest && input[i] > secondLargest)
//            {
//                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
// 
//                secondLargest = input[i];
//            }
//        }
// 
//      //System.out.println("largest :"+max1+" second largest :"+max2);int firstLargest, secondLargest;  return secondLargest;
//        
//        System.out.println("largest :"+firstLargest+" second largest :"+secondLargest);//int firstLargest, secondLargest;
//		

	}

}
