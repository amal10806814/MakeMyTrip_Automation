package LogicalPrograms;

import java.util.Scanner;

public class primeNumber1 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 6, 7, 8, 9, 10};

    boolean isPrime = true;
  for (int i = 0; i < arr.length; i++) {
            for (int b = 2; b < arr[i]; b++) {
                if (arr[i] % b == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println("prime");
            }
        }
    }


    //
//    public static void main(String[] args) {
//        int[] array = new int[5];
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < 5; i++) {
//            array[i] = in.nextInt();
//        }
//        // loop through the numbers one by one
//        for (int i = 0; i < array.length; i++) {
//            boolean isPrime = true;
//            if (array[i] == 1)
//                isPrime = false;
//            else {
//                // check to see if the numbers are prime
//                for (int j = 2; j <= array[i] / 2; j++) {
//                    if (array[i] % j == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//            }
//            // print the number
//            if (isPrime)
//                System.out.println(array[i] + " is a prime number in the array ");
//        }
//    }
//}
