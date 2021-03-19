package JavaPractice;

public class hsbcBank implements USbank {

    int carloan = 1000;

    public void credit()
    {
        System.out.println("credit amount");
    }

    public void debit()
    {
        System.out.println("debit amount");
    }

    public void homeloan()
    {
        System.out.println("homeloan amount");
    }
}
