package JavaPractice;

public class Fibonacci_Class {

  public static void main(String[] args) {

    int A1 = 0 ;
    int A2 =1 ;


    for(int i =1 ; i<=10; i++)  //i=6  1,1,2,3,5,8,13,21
    {

      System.out.println( A1); //5

      int Sum = A1+ A2 ;   //13

      A1= A2;   //8

      A2 = Sum;   //13

    }
  }

}
