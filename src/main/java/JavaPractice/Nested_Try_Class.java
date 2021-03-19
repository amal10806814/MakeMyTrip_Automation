package JavaPractice;

public class Nested_Try_Class {

  public static void main(String[] args) {

    try {

      int a = 5;

      try {
        System.out.println("try 2 block");
        int b = 5 / 0;
      } catch (ArithmeticException e2) {
        System.out.println("Arithmetic error 2");
      }

      try {
        System.out.println("try 3 block");

        int c = 5 / 0;
      } catch (ArrayIndexOutOfBoundsException e3) {
        System.out.println("Array index error 3");
      }
    }

      catch (ArithmeticException e1) {
        System.out.println("Arithmetic error parent try1");
      }
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Index parent try1");
      }

      catch (Exception e)
      {
        System.out.println("generic error parent try1");
      }

      System.out.println("atlast last statement print");

  }

}
