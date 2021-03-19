package LogicalPrograms;

public class starPatternTwo {

    public static void main(String[] args) {

        for(int i=1; i<=4; i++)
        {
            for(int j =1 ;j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=3 ; k>=1 ; k--)
        {
            for(int p=1 ; p<=k; p++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
