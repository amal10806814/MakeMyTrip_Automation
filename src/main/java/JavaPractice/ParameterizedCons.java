package JavaPractice;

public class ParameterizedCons {

    private int var ;

  ParameterizedCons(int num )
  {
    var = num;
  }

  public int  myvalue()
  {
    return var;
  }

  public static void main(String[] args) {
    ParameterizedCons obj = new ParameterizedCons(10);
    System.out.println("calling method: " + obj.myvalue());
    System.out.println(obj.var);
  }
}
