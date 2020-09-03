package JavaPractice;

public class ConstructorOverloading {

  private  int i ;
  private  String y ;

  ConstructorOverloading()
  {
    i =10 ;
    y = "amal";
  }

  ConstructorOverloading(int x , String z)
  {
    i = x;
    y = z ;

  }


  public static void main(String[] args) {

    ConstructorOverloading obj = new ConstructorOverloading();
    System.out.println(obj.i);
    System.out.println(obj.y);

    ConstructorOverloading objx = new ConstructorOverloading(100,"chaudhary");

    System.out.println(objx.i);
    System.out.println(objx.y);

  }
}
