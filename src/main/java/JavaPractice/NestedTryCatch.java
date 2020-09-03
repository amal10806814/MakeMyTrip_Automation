package JavaPractice;

public class NestedTryCatch {

  public static void main(String[] args) {

    try{

      int a = 4+5 ;

      try{
        int c = 5+5 ;

        try {

          int[] x = {3, 5, 4, 6};

          System.out.println(x[10]);
        }
        catch (ArithmeticException e3)
        {
          System.out.println("AE Exception");
        }
      }
      catch (ArithmeticException e2)
      {
        System.out.println("block 2 error , AE Exception");
      }
    }

    catch (ArrayIndexOutOfBoundsException e1)
    {
      System.out.println("parent block error , Array index error");
    }

    catch (Exception e4)
    {
      System.out.println( "generic error");

    }
  }

}
