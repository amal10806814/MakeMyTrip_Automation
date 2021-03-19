package JavaPractice;

public class StaticVariable {

  static int var1 = 11;

  String var2 ;

  public static void main (String args[])
  {
    StaticVariable obj1 = new StaticVariable();

    StaticVariable obj2 = new StaticVariable();

    obj1.var2 = "commonnew";

    var1 = 88;

    obj2.var2 = "second new";

    var1 = 101;

    System.out.println("object 1" +" "+ obj1.var2);
    System.out.println("object 1" +" "+ obj1.var1);

    System.out.println("object 2" +" "+ obj2.var2);
    System.out.println("object 2" +" "+ obj2.var1);

  }
}