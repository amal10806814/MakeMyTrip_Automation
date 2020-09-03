package SumitProblems;

public class linkedClass {

    Node head = null;
    Node current ;

    public void addData(int data) {

        Node newNode = new Node(data);

        if(head==null)
        {
            head= newNode;
            newNode.next = null;
        }
        else {
            current = head;

            while (current.next!=null)
            {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void display()
    {

        if(head==null)
        {
            System.out.println("Empty linkedList");
        }

        else {
            current = head;
            while (current!=null)
            {
                System.out.println("linkedlist data " + current.data);
                current = current.next;
            }

        }
    }

    public void insertDataInMiddle(int data) {
        Node slow = head;  //node1
        Node fast = head.next; //node2
        int count = 0;

        Node newNode = new Node(data);

        current = head;
        while (fast!=null&&fast.next!=null)  //node1 node2 node3 node4 node5 node6
        {
            slow = slow.next;  //node3
            fast=fast.next.next; //node6
        }
        System.out.println("middle of linkedlist " + slow.data);

         newNode.next = slow.next;
         slow.next = newNode;


        //to get the middle of a linked list
        //        while (current != null) {
        //            count++;
        //            current = current.next;
        //        }
        //        int middleCount = count / 2;
        //        System.out.println(middleCount);
    }

}
