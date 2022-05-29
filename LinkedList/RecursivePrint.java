class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data=x;
        next=null;
    }
}

public class RecursivePrint
{ 
    public static void rPrint(Node head) //print linked list recursively
    {
        Node n=head;
        
        if(n==null)
            return;
        
        System.out.print(n.data+" ");
        
        n=n.next;
        
        rPrint(n);
    }

    public static void main(String args[])
    {
      Node head=new Node(40);
      Node temp2=new Node(20);
      Node temp3=new Node(30);
      Node temp4=new Node(50);
      
      head.next=temp2;
      temp2.next=temp3;
      temp3.next=temp4;
      
      rPrint(head);
    }
}