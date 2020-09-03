package SumitProblems;

public class callingLinkedListImplemention {

    public static void main(String[] args) {

//        LinkedListImplementation ll = new LinkedListImplementation();
//
//        ll.addData(1);
//        ll.addData(2);
//        ll.addData(3);
//        ll.addData(8);
//
//        ll.display();
//
//        System.out.println("===========");
//
//        ll.addElementInMiddle(9);
//
//        ll.display();
//
//        System.out.println("============");
//
//       ll.addElementInMiddle(11);
//
//        ll.display();

        linkedClass ll = new linkedClass();

        ll.addData(10);
        ll.addData(20);
        ll.addData(30);
        ll.addData(40);
        ll.addData(50);
        ll.addData(60);

        ll.display();

        System.out.println("===========");

        ll.insertDataInMiddle(35);

        ll.display();





    }
}
