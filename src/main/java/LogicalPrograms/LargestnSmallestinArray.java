package LogicalPrograms;

public class LargestnSmallestinArray {

    public static void main(String[] args) {

        int[] arr = {10,20,5,25,3,30};

        int largestno = 10;
        int smallestno = 10;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i]>largestno)
            {
                largestno = arr[i];
            }
            else
            {
                smallestno= arr[i];
            }
        }

        System.out.println(smallestno + " "+ largestno);
    }
}
