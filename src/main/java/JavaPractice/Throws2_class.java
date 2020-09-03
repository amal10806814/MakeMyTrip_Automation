package JavaPractice;

public class Throws2_class {

  public static void main(String[] args) {

    try{
      Throws_Class obj = new Throws_Class();
      obj.method(1);
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
  }

}
