package PracticeProject;

public class PrivateParameterizedConstructor {

  private int var ;
  private  String name;

  PrivateParameterizedConstructor()
  {
    this.var = 10;
  }

  PrivateParameterizedConstructor(int x ,String owner)
  {
    this.var = x;
    this.name = owner;
  }

  public static void main (String args[])
  {
    PrivateParameterizedConstructor obj = new PrivateParameterizedConstructor();

    System.out.println(obj.var);

    PrivateParameterizedConstructor obj1 = new PrivateParameterizedConstructor(10,"amal");
    System.out.println(obj1.var);
    System.out.println(obj1.name);

  }
}
