package JavaConceptOfTheDay;

public class MissingElementInArray {
    public static void main(String[] args) {

        int n = 8;

        int result= 0;
        int result1= 0;

        int[] a = {1,2,3,4,6,7,8};

        int [] b = {1,2,3,4,5,6,7,8};

        for(int i = 0 ; i < a.length ; i++)
        {
            result = result + a[i];
        }

        for (int j = 0 ; j< b.length ; j++)
        {
            result1 = result1 + b[j];
        }

        int missingNo = result1 - result;

        System.out.println(missingNo);
    }
}
