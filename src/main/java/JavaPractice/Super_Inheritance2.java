package JavaPractice;

public class Super_Inheritance2 extends Super_Inheritance1 {

  public static void method2()
  {
    System.out.println("child class method");
  }

  public static void main(String[] args) {
    {
      Super_Inheritance1 obj1 = new Super_Inheritance2();
      obj1.method2();

      Super_Inheritance2 obj2 = new Super_Inheritance2();
      obj2.method2();
    }
  }
}
