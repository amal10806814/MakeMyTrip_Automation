package JavaPractice;

public class Throw_Try_Catch {

  public void method() throws ArithmeticException
  {
    throw new ArithmeticException("Arithmetic Exception");
  }

  public static void main(String[] args) throws ArithmeticException{

    Throw_Try_Catch obj = new Throw_Try_Catch();

      obj.method();

    System.out.println("End of program");

  }

}
