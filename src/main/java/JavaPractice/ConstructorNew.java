package JavaPractice;

public class ConstructorNew {

  int i  ;
  String y  ;

  ConstructorNew(int x , String z)
  {
    this.i = x;
    this.y = z;
  }

  public static void main(String[] args) {

    ConstructorNew obj1 = new ConstructorNew(11,"chaudhary");
    ConstructorNew obj2 = new ConstructorNew(15,"golu");

    System.out.println(obj1.i);
    System.out.println(obj1.y);


  }

}
