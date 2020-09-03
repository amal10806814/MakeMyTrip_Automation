package JavaConceptOfTheDay;

public class MissingNo {
    public static void main(String[] args) {

        //If ‘n‘ is the positive number and ‘a‘ is an array of integers of length n-1 containing elements from 1 to n.
        // Then find the missing number in ‘a’ in the range from 1 to n.
        // Occurrence of each element is only once. If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8.
        // For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case).
        // You have to find out that missing number

        int n = 5;

        int[] a = {5,4,2,1};  // array a of length n-1 = 4

//        int[] b ={1,2,3,4,5}; // create one more array of length =n and containing all elements in the range from 1 to 5

        int SumOfNumber = (n*(n+1))/2;

        int sum = 0 ;
        for(int i = 0 ; i < a.length; i++)
        {
            sum = sum + a[i];
        }

        int missingNumber = SumOfNumber -sum;

        System.out.println(missingNumber);
    }
}
