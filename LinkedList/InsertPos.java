public class InsertPos
{
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            this.data=d;
        }
    }

    public void insertB(int d)
    {
        Node temp=new Node(d);

        if(head==null)
        {
            head = new Node(d);
            return;
        }


        temp.next=head; //head me old start node ka referene tha.
        head=temp; //head me temp ka reference
        
    }

    void insertAfter(Node previous_n, int d)
    {
        if(previous_n==null)
        {
            System.out.println("Given node can't be null");
            return;
        }

        Node temp=new Node(d);

        temp.next=previous_n.next;

        previous_n.next=temp;
        return;

    }

    void print()
    {
        Node n=head;

        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }

    public static void main(String[] args)
    {
        InsertPos n1 = new InsertPos();

        n1.insertB(30);
        n1.insertB(20);
        n1.insertB(10);

        n1.print();
        
        n1.insertAfter(n1.head.next, 25);
        
        n1.print();
    }

}
