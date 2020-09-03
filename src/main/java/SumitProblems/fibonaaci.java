package SumitProblems;

public class fibonaaci {
    public static void main(String[] args) {

        int a = 0 ; int b = 1 ;

        System.out.println(a);
        System.out.println(b);

        //0 1 1 2

        for(int i =0 ;i < 10 ; i++) //
        {

            b = a+b; //3
            a=b-a; //2

            System.out.println(b);
        }

    }
}
