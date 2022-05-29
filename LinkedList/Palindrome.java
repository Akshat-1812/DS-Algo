public class Palindrome
{
    //reverse the list
    private static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node forward=null;
        
        while (curr!=null)
        {
            forward=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=forward;
        }

        return prev;
    }

    // find mid element
    private static Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }
    
    //check palindrome
    private static boolean isPalindrome(Node head)
    {
        //LL contains only 1 node then return true;
        if(head.next==null)
        {
            return true;
        }

        //Step 1 find middle of list
        Node mid = getMid(head);

        // step 2 reverse the list after middle
        Node temp = mid.next;
        mid.next=reverse(temp);

        // step 3 create two pointers to traverse normal and reversed list
        Node head1=head;
        Node head2=mid.next;

        // step 4 traverse
        while (head2!=null)
        {
            if(head1.data!=head2.data)
            {
                return false;
            }   

            head1=head1.next;
            head2=head2.next;
        }

        // step 5 repeat step 2 to make the list original // optional step
        temp = mid.next;
        mid.next=reverse(temp);
        
        return true;
    }   

    // Print LL
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
        Node head=new Node(1);
        Node temp2=new Node(2);
        Node temp3=new Node(3);
        Node temp4=new Node(3);
        Node temp5=new Node(2);
        Node temp6=new Node(1);
        
        head.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;
        temp5.next=temp6;
    
        System.out.println("origina List");
        rPrint(head);

        if(isPalindrome(head))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
