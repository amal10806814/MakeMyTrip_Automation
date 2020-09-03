package JavaPractice;

public class TryCatch_Class {

  public static void main(String[] args) {

    int[] arr = new int[7];

    try {

      arr[10] = 10 / 5;

      System.out.println("try block statement");

    }

    catch (ArithmeticException e) {
      System.out.println("Arithmetic Exceptiokn");
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("array index errror ");
    }

    catch (Exception e) {
      System.out.println("generic exception");

    }

    System.out.println("I am out of try catch block");
  }
}

