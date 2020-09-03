package JavaPractice;

public class ConstructorBasic {

  String name ;

  public ConstructorBasic()
  {
    this.name ="beginner book" ;

  }

  public static void main (String args[])
  {
    ConstructorBasic obj = new ConstructorBasic();
    System.out.print(obj.name);
  }
}
