
class InsertEnd 
{
    Node head;

    class Node
    {
        int data;
        Node next;
    
        Node(int d)
        {
            data=d;
            next=null;
        }
        
    }

    public void insertEnd(int d)
    {
        Node temp=new Node(d);

        if(head==null)
        {
            head=new Node(d);
            return;
        }

        Node n=head;

        while(n.next!=null)
        {
            n=n.next;
        }

        n.next=temp;
        return;
        // return temp;
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

       InsertEnd in=new InsertEnd();

       in.insertEnd(10);
       in.insertEnd(20);
       in.insertEnd(30);
       
       in.print();
        

    }
}
