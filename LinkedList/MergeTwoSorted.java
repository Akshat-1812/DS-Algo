/**
 * Merge two sorted LL
 * I/P head1->1-->3-->5-->null
*      head2->2-->4-->5-->null

O/P head->1-->2-->3-->4-->5-->null
 */ 

public class MergeTwoSorted
{

    private static Node merge(Node head1, Node head2)
    {
        //only 1 element is present in 1st LL point it to entire 2nd LL    
        if(head1.next==null)
        {
            head1.next=head2;
            return head1;
        }

        //list1 
        Node curr1=head1;
        Node next1=curr1.next;

        //2nd list track
        Node curr2 = head2;
        // Node next2 = head2.next;
        Node next2 = head2;

        while (next1!=null && curr2!=null)
        {
            if( (curr2.data >= curr1.data) && (curr2.data <= next1.data) )   
            {
                //step 1) add new node
                // curr1 k next me curr2 ka ref curr1-->curr2
                curr1.next=curr2;

                //inc next2  so the track of 2nd LL is not lost
                next2=curr2.next;

                //curr2 k next me next1 ka ref curr1-->curr2-->next1
                curr2.next=next1;

                //step 2) upadte pointers
                curr1=curr2;
                curr2=next2;

            }
            else //curr2 ka data doesn't lie in our range
            {
                //update pointers
                
                //curr1 and next1 ko aage badhana hai padega
                curr1=next1;
                next1=next1.next;

                if (next1==null)
                {
                    curr1.next=curr2;
                    return head1;   
                }
            }
        }

        return head1;
    }

    private static Node mergeLL(Node head1, Node head2)
    {
        if (head1 == null)
        {
            return  head2;   
        }
        else if(head2==null)
        {
            return head1;
        }

        if(head1.data<=head2.data)
        {
            return merge(head1,head2);
        }
        else
        {
            return merge(head2, head1);
        }

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
        Node head1=new Node(1);
        Node temp2=new Node(3);
        Node temp3=new Node(5);

        head1.next=temp2;
        temp2.next=temp3;

        //2nd LL
        Node head2=new Node(2);
        Node temp2_1=new Node(4);
        Node temp3_1=new Node(5);
        
        head2.next=temp2_1;
        temp2_1.next=temp3_1;
        
        //temp4.next=head; //uncomment this and get circular LL
        
        System.out.println("original list 1");
        rPrint(head1);

        System.out.println("original list 2");
        rPrint(head2);

        System.out.println("Sorted List ");
        
        Node res=mergeLL(head1,head2);
        
        rPrint(res);
     
    }
}
