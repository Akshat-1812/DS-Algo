import java.util.*;

public class UnsortedDuplicates
{
    private static Node rDuplicates(Node head)
    {
        if(head==null)
        {
            return null;
        }

        // Map<Integer,Boolean> vis = new HashMap<>();
        Map<Integer,Boolean> vis = new HashMap<>();
        
        Node curr=head.next;
        
        Node prev=head;
        vis.put(head.data,true);

        while (curr!=null)
        {
            if(vis.containsKey(curr.data)==true)   
            {
                prev.next=curr.next;
                // curr=curr.next;
            }
            else
            {
                vis.put(curr.data, true);
                prev=curr;
            }
            
            curr=curr.next;
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
        Node head=new Node(40);
        Node temp2=new Node(20);
        Node temp2_1=new Node(50);
        Node temp3=new Node(40);
        Node temp4=new Node(20);
        Node temp4_1=new Node(60);
        
        head.next=temp2;
        temp2.next=temp2_1;
        temp2_1.next=temp3;
        temp3.next=temp4;
        temp4.next=temp4_1;

        // temp4.next=temp2; //comment this and get singly LL

        rPrint(head);

        Node res=rDuplicates(head);

        if(res!=null)
        {
            rPrint(res);
        }
    }
}