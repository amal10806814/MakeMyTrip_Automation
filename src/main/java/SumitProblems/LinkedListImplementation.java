package SumitProblems;

public class LinkedListImplementation {

    Node head =null;
    Node current ;

    public void addData(int data)
    {
        Node newNode = new Node(data);

        if(head==null)
        {
            head =newNode;

        }
        else
        {
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
        current = head;

        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }

        else
        {
            while (current!=null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public void addElementInMiddle(int data)
    {
        Node newNode1 = new Node(data);

        Node slowPointer =  head;
        Node fastPointer = head.next;

        current = head;

        if(head==null) {
            newNode1.next = current.next;
            current.next = newNode1;
        }

        else
            {
            while (fastPointer!=null && fastPointer.next!=null)  //head 2 3 4 5
            {
                    slowPointer = slowPointer.next; //2
                    fastPointer = fastPointer.next.next; //4
            }

            newNode1.next = slowPointer.next;
            slowPointer.next = newNode1;

        }
    }
}
