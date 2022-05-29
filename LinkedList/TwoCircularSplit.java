/**
 * Given two circular LL split them into two half.
 
I/P  head->1-->2-->3-->4-->5-->6-->head //even circular LL
O/P  head1->1-->2-->3-->head1   //circular
     head2->4-->5-->6-->head2   //circular

I/P :: head->1-->2-->3-->4-->5-->head //odd circular LL
O/P :: head1->1-->2-->3-->head1   //circular
       head2->4-->5-->head2   //circular

 */

public class TwoCircularSplit
{
    static Node head1,head2;

    private static void split(Node head)
    {
        if(head==null)
        {
            return;
        }

        Node slow=head;
        Node fast=head.next;

        //step 1) find mid and end of circular LL
        while(fast.next!=head && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;

            if(fast.next!=head)
            {
                fast=fast.next;
            }
            else
            {
                break;
            }
        }
        
        //step 2) store both list starting point
        head1=head; //for 1st list
        head2=slow.next; // for 2nd list

        //step 3) make list circular
        fast.next=slow.next;//2nd list ko circular bao do
        slow.next=head;//1st list ko circular bna do

        return;

    }   

    public static void rPrint(Node head) //print circular LL
    {
        Node n=head;
        
        if(head!=null)
        {
            do
            {
                System.out.print(n.data +" ");
                n=n.next;
            }while(n!=head);

            System.out.println();
        }
       
        return;
    }

    public static void main(String[] args)
    {
        Node head=new Node(1);
        Node temp2=new Node(2);
        Node temp3=new Node(3);
        Node temp4=new Node(4);
        Node temp5=new Node(5);
        Node temp6=new Node(6);
        
        head.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5; 
        temp5.next=temp6;
        // temp5.next=head;//uncomment to get odd length Circular LL
        temp6.next=head;//uncomment this and get even length circular LL

        
        System.out.println("original list");
        rPrint(head);
        
        split(head);
        
        System.out.println("1st half");
        rPrint(head1);

        System.out.println("2st half");
        rPrint(head2);
    }
}
