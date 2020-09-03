package JavaConceptOfTheDay;

public class PairOfElementSumIsEqualToGivenNumber {
    public static void main(String[] args) {

        int[] a = {4, 5, 7, 11, 9, 13, 8, 12};

        int GivenNo = 20;

        for (int i = 0; i < a.length; i++)
        {
            for(int j=i+1 ; j< a.length; j++ )
            {
                if(a[i]+a[j]==GivenNo)
                {
                    System.out.println(a[i] +","+ a[j]);
                }
            }
        }
    }
}
