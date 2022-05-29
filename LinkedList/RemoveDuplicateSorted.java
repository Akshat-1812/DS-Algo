
public class RemoveDuplicateSorted
{
    private static Node duplicates(Node head)
    {
        //empty ll
        if(head==null)
        {
            return null;
        }

        //non empty

        Node curr=head;

        while (curr!=null)
        {
            if( (curr.next!=null) && curr.data==curr.next.data )
            {
                //pt. curr to next of next node
                Node next_next = curr.next.next;

                // Node delete1=curr.next;
                
                System.gc();
                
                curr.next=next_next;
            }
            else
            {
                curr=curr.next;
            }
        }
        
        return head;
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
        Node head=new Node(10);
        Node temp2=new Node(20);
        Node temp2_1=new Node(20);
        Node temp3=new Node(30);
        Node temp4=new Node(40);
        
        head.next=temp2;
        temp2.next=temp2_1;
        temp2_1.next=temp3;
        temp3.next=temp4;
        // temp4.next=temp2; //comment this and get singly LL

        rPrint(head);

        Node res=duplicates(head);

        if(res!=null)
        {
            rPrint(res);
        }
        
    }

    

}
