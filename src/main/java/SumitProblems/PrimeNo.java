package SumitProblems;

public class PrimeNo {

    public static boolean isPrimeNumber(int a) {

        if (a < 2) {
           return false;

        }

        for(int i =2 ; i<a ;i++)
        {
            if(a%i==0)
            {
               return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(isPrimeNumber(1));


    }
}
