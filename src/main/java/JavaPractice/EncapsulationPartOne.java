package JavaPractice;

public class EncapsulationPartOne {

  private String name ;
  private int empID ;

  public void setValue(int x , String y)
  {
    this.empID = x;
    this.name = y ;
  }

  public int getValue()
  {
    return empID;
  }

  public String getValue1()
  {
    return name;
  }

}
