/**
 * remove and detect loop --> part-3
 * 
 * I/P A->B->C->D-->E-->C
 * O/P A->B->C->D-->E-->null
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

public class DetectAndRemoveLoop
{
    private static Node floydCheck(Node head)
    {
        if(head==null)
        {
            return null;
        }

        Node slow=head;
        Node fast=head;

        while(slow!=null && fast!=null )
        {
            fast=fast.next; 

            if (fast!=null)
            {
                fast=fast.next;
            }

            slow=slow.next;

            if(slow==fast)
            {
                System.out.println("loop is present ");
                return slow;
            }
        } 

        return null;
    }

    private static Node floydBeginningOfLoop(Node head)
    {
        if(head==null)
        {
            return null;
        }

        Node slow=head;

        Node interset=floydCheck(head);

        if(interset==null)
        {
            return null;
        }

        slow=head;
        
        while (slow!=interset )
        {
            slow=slow.next;
            interset=interset.next;
        }

        System.out.println("loop is present at "+slow.data);

        return slow;
    }   

    private static void removeLoop(Node head)
    {
        if (head==null)
        {
            System.out.println("list is empty");
            return;   
        }

        Node startOfLoop = floydBeginningOfLoop(head);

        if(startOfLoop==null)//if method return type is Node return head;
        {
            return;
        }

        Node temp=startOfLoop;

        while (temp.next!=startOfLoop)
        {
            temp=temp.next;   
        }

        temp.next=null;
        return;
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
        temp4.next=temp2; //comment this and get singly LL

        removeLoop(head);

        System.out.println("loop is removed");

        rPrint(head);
    }

}
