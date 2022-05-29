class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data=d;
        next=null;
    }
}

class InsertB
{

    static Node insertB(Node head,int d)
    {
        Node temp=new Node(d);
        temp.next=head;
        return temp;
    }

    static void print(Node head)
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
        // LinkedList l1=new LinkedList();
    
        Node head=null;

        head=insertB(head, 30);
        head=insertB(head, 20);
        head=insertB(head,10);    

        print(head);
        
    }

}
