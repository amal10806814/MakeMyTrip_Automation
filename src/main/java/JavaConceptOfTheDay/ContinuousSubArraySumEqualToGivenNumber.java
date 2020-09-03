package JavaConceptOfTheDay;

public class ContinuousSubArraySumEqualToGivenNumber {
    public static void main(String[] args) {

        int [] a = {12,5,31,9,21,8};
        int finalValue = 38;

        for (int i = 0 ; i< a.length; i++) //1
        {
            int result = a[i]; //5
            for (int j = i+1; j< a.length ; j++)
            {
                result = result + a[j];

                if(result==finalValue) {
                    System.out.println(result);
                    for (int k = i; k <= j; k++)
                    {
                        System.out.println("subarray numbers" + a[k]);
                    }
                }
            }
        }
    }
}
