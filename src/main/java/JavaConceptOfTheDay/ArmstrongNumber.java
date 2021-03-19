package JavaConceptOfTheDay;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int a = 9474;

        String s = Integer.toString(a);
        int c = a;

        int sum = 0;

        int b;
        while(a!=0)
        {
            b = a%10; //9
            int intial = 1;
            for(int i =0 ;i<s.length(); i++ )
            {
                intial = intial *b; //256+7*4+256+9*4
            }
            sum = sum+intial;
            a= a/10; //0
        }

        if (sum==c)
        {
            System.out.println("ArmtStrong");
        }
        else
        {
            System.out.println("not armstrong ");
        }
    }
}
