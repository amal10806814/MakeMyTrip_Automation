package JavaPractice;

public class MultipleStaticBlock {

  static  int i ;

  static  String name ;

 static
  {
    i = 10;
    name = "chirag";
  }

  static
  {
   i =20 ;
   name = "amal";
  }

  void method1()
  {
    System.out.println(i +" "+ name);
  }

  public static void main (String args[])
  {
    MultipleStaticBlock obj = new MultipleStaticBlock();

    obj.method1();

    System.out.println(i);
    System.out.println(name);
  }


}
