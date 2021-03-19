package JavaConceptOfTheDay;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();

        boolean value = true;
        if(num==2)
        {
            System.out.println("prime");
            return  ;
        }

        for(int i=2; i<num ; i++)
        {
          if(num%i==0)
          {
             value = false;
              break;
          }
        }

        if(value)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
