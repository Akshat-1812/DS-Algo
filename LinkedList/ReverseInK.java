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

public class ReverseInK
{
    public static Node kReverse(Node head, int k)
    {
        if(head == null)
        {
            return null;
        }

    //step1: reverse first k nodes
        Node next = null;
        Node curr = head;
        Node prev = null;
        int count= 0;

        while( curr != null && count < k )
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        //step2: Recursion dekhlega aage ka 
        if(next != null) {
            head.next = kReverse(next,k);
        }

        //step3: return head of reversed list
        return prev;
    }

    public static void rPrint(Node head) //print linked list recursively
    {
        Node n=head;
        
        while(n!=null)
        {
            System.out.print(n.data +" ");
            n=n.next;
        }
        System.out.println();
       
        return;
       
    }

    public static void main(String[] args)
    {
        Node head=new Node(40);
        Node temp2=new Node(20);
        Node temp3=new Node(30);
        Node temp4=new Node(50);
        
        head.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        
        System.out.println("original list");
        rPrint(head);
        int k=2;

        System.out.println("reversed list");
        Node res=kReverse(head,k);

        rPrint(res);

        

    }  
}
