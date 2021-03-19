package JavaPractice;

public class Exception_inside_method  {

  public void method1 () throws ArithmeticException
  {

    int i = 10/0;
  }
    /*int a = 10 ;
    int b = 10;
    if(a==b) throw new ArithmeticException("Arithmetic exception sumit  ");

    else{
      System.out.println("a equal to b");
    }
  }
*/
  public void method2 () throws ArithmeticException {

    method1();

  }

  public void method3()
  {
    try{
      method2();
    }
    catch (NullPointerException e)
    {
      System.out.println("method 2 Arithmetic exception");
    }

  }

  public static void main(String[] args) {

    Exception_inside_method obj = new Exception_inside_method();

    obj.method3();

    System.out.println("program ends");
  }
}
