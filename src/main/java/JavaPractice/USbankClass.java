package JavaPractice;

public class USbankClass implements USbank {

    public void credit()
    {
        System.out.println("credit");
    }
    public void debit()
    {
        System.out.println("debit");
    }

    public static void main(String[] args) {
        USbankClass obj = new USbankClass();
        obj.credit();
    }
}
