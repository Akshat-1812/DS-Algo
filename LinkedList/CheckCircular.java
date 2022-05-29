/*

LL is circular if 
1] A->B->A
2] A->A
3] LL is empty
*/

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

public class CheckCircular
{
    private static boolean check(Node head)
    {
        if(head==null)
        {
            return true;
        }

        Node temp=head.next;

        while (temp!=null && head!=temp)
        {
            temp=temp.next;
        }

        if(temp==head)
        {
            return true;
        }
        
        return false;

    }   

    public static void rPrint(Node head) //print linked list recursively
    {
        Node n=head.next;
        
        System.out.print(head.data +" ");

        while(n!=head && n!=null)
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
        //temp4.next=head; //uncomment this and get circular LL
        
        System.out.println("original list");
        rPrint(head);
        
        //int k=2;

        //System.out.println("reversed list");
        
        if(check(head))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        //rPrint(res);
    }
}
