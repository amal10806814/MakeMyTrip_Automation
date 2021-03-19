package JavaPractice;

public class ThrowsProblem_Class {

  void method1() throws ArithmeticException {
int x =10;
int y = 20;
    if (x == y)
      throw new ArithmeticException("x is equal to y");
    else {
      System.out.println("x equal to 1");
    }
  }

  void method2  () {
    try {
      method1();
    } catch (ArithmeticException e) {
      System.out.println("Arithemetic Exception occured");
    }
  }

  public static void main(String[] args) {
    ThrowsProblem_Class obj = new ThrowsProblem_Class();

    obj.method2();

  }
  }

