package JavaPractice;

public class StaticMethod {

  static int var1 = 10 ;

  static void method1()
  {
    System.out.println(var1);
  }

  void nonstaticmethod2()
  {
    method1();
  }

  public static void main (String args[])
  {
    method1();

    StaticMethod obj1 = new StaticMethod();
    obj1.nonstaticmethod2();
  }
}
