package JavaConceptOfTheDay;

public class IntersectionOfTwoArray {

    public static void main(String[] args) {

        // can also be done using hashSet retainAll method

        int [] a = {10,20,30,40};

        int [] b = {5,7,20,8,30};

        for(int i =0 ; i < a.length ; i++)
        {
            for(int j =0 ; j<b.length ; j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                }

            }

        }
    }
}
