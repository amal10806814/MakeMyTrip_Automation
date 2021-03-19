package JavaPractice;

public class ThrowsException {

  public void method(int sage , int sweight) {
    if (  sage >15 &&  sweight >50)
    {
      throw new ArithmeticException("student can not be registered");
    }

  else{
      System.out.println("student is elgible");
    }

  }
  public static void main(String[] args) {

    ThrowsException obj = new ThrowsException();

    obj.method(50, 100);



  }
}
