package JavaPractice;

public class VariableExample {

  public String amal = "instance variable";

  public void method()
  {
    String amal = "local variable";
    System.out.println(amal);
  }

  public static void main (String args[])
  {
    VariableExample obj = new VariableExample();
    obj.method();

    System.out.println(obj.amal);
  }
}
