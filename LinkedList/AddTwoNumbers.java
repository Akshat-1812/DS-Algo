/**

Que:-> given to LL containing an integer return addition of data

I/P head1->1-->2-->3-->null
    head2->3-->5-->0-->null

O/P:- head->4-->7-->3-->null (123+350)
 */
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }    
}

public class AddTwoNumbers
{
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
    
    static Node head ,tail;
    
    private static void insertAtTail(int val)
    {
        Node temp = new Node(val);

        // Node temp=new Node(d);

        if(head==null)
        {
            head=new Node(val);
            return;
        }

        Node n=head;

        while(n.next!=null)
        {
            n=n.next;
        }

        n.next=temp;
        return;

        // if (ansHead == null)//when list is empty
        // {
        //     ansHead=temp;
        //     ansTail=temp;
        //     return ansHead;
        // }
        // else
        // {
        //     ansTail.next=temp;
        //     ansTail=temp;
        //     return ansHead;
        // }

        
    }

    private static Node add(Node head1, Node head2)
    {
        int carry=0;
        // Node ansHead=null;
        // Node ansTail=null;

        while (head1!=null || head2!=null || carry!=0)
        {
            
            int val1=0;
            int val2=0;

            if (head1 != null)
            {
                val1=head1.data;   
            }
            
            if (head2 != null)
            {
                val2=head2.data;   
            }

            int sum=carry+val1+val2;

            int digit = sum%10; //get last digit 12%10=2;

            //create node and add in answere LL
            // insertAtTail(ansHead,ansTail,digit);
            insertAtTail(digit);
            
            carry = sum/10; // give 1st digit 12/10=1;

            if (head1!=null) {
                head1=head1.next;
            }

            if (head2!=null) {
                head2=head2.next;
            }
            
        }

        return head;
    }


    private static Node addData(Node head1, Node head2)
    {
        
        //step1 reverse input LL
        head1 = reverse(head1);
        head2 = reverse(head2);

        //step2 add two LL
        Node res=add(head1,head2);

        // System.out.println("---------------");
        // rPrint(res);

        //step reverse the new list
        res=reverse(res);
        
        return res;
    }   


    public static void rPrint(Node head) //print linked list recursively
    {
        Node n=head;
        
        //System.out.print(head.data +" ");

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
        // 2 9 1 2 9 9 2 8 2
        Node head1=new Node(2);
        Node temp2=new Node(9);
        Node temp3=new Node(1);
        Node temp4=new Node(2);
        Node temp5=new Node(9);
        Node temp6=new Node(9);
        Node temp7=new Node(2);
        Node temp8=new Node(8);
        Node temp9=new Node(2);

        head1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;
        temp5.next=temp6;
        temp6.next=temp7;
        temp7.next=temp8;
        temp8.next=temp9;

        //2nd LL
        Node head2=new Node(2);
        Node temp2_1=new Node(8);
        Node temp3_1=new Node(9);
        
        head2.next=temp2_1;
        temp2_1.next=temp3_1;
        
        //temp4.next=head; //uncomment this and get circular LL
        
        System.out.println("original list 1");
        rPrint(head1);

        System.out.println("original list 2");
        rPrint(head2);

        System.out.println("Addition is :-");

        Node data=addData(head1,head2);

        rPrint(data);


        
    }

}
