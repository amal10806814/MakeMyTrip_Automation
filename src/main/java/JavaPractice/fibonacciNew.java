package JavaPractice;

public class fibonacciNew {

    public static void main(String[] args) {

        int a =0;
        int b =1 ;

        System.out.println(a);
        System.out.println(b);

        for(int i =0 ; i <=10; i++)
        {
            b=b+a;
            a=b-a;
            System.out.println(b);
        }
    }
}
