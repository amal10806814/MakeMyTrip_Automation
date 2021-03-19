package JavaPractice;

public class testBank extends hsbcBank {

    public static void main(String[] args) {

        hsbcBank a = new hsbcBank();

        System.out.println(a.carloan);

        a.credit();
        a.debit();
        a.homeloan();

        USbank x = new hsbcBank();

        x.credit();
        x.debit();
      //  USbank.loan;  calling it not a statement
    }




}
