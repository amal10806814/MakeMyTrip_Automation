package PracticeProject;

public class ParamterizedConstructor {

  int a;
  String word;

  ParamterizedConstructor(int i , String name)
  {
    this.a = i;
    this.word = name;
  }

  void method1()
  {
    System.out.print(a +"  "+ word );
  }

  public static void main (String args[])
  {
    ParamterizedConstructor obj = new ParamterizedConstructor(5,"amal");

    obj.method1();

  }
}
