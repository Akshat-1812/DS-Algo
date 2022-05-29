/**
 *  Giver LL of 0,1,2 sort it
 */
public class SortThree
{
    private static void insertAtTail(Node tail, Node curr)
    {
        //insert at end
        //tail k next me curr ka ref.
        tail.next=curr;

        //tail ko aage bdha kr curr pr rakh do
        tail=curr;
    }
    //efficient solution -- TC->O(n) & SC->O(1);
    private static void effSort(Node head)
    {
        if(head==null)
        {
            return;
        }
        
        //create dummy node
        Node zeroHead = new Node(-1);
        Node zeroTail=zeroHead;

        Node oneHead = new Node(-1);
        Node oneTail=oneHead;

        Node twoHead = new Node(-1);
        Node twoTail=twoHead;

        Node curr=head;

        while (curr!=null)
        {
            if(curr.data==0)
            {
                //insert at the end of dummy node
                insertAtTail(zeroTail,curr);
            }
            else if (curr.data==1)
            {
                insertAtTail(oneTail,curr);
            }
            else if (curr.data==2)
            {
                insertAtTail(twoTail,curr);
            }

            curr=curr.next;
        }

        //merge 3 list

        // 1's list not empty
        if (oneHead.next != null)
        {
            zeroTail.next=oneHead.next;
        }
        else //1's list empty
        {
            zeroTail.next=twoHead.next;
        }


        oneTail.next=twoHead.next;

        twoTail.next=null;

        //setup head
        head=zeroHead.next;

        //call gc to delete dereference nodes
        System.gc();

        return;
    } 

   

    private static void naiveSort(Node head)
    {
        if(head==null)
        {
            return;
        }

        int zero=0,one=0,two=0;
        Node curr=head;

        while (curr!=null)
        {
            if(curr.data==0)
            {
                zero++;
            }
            else if(curr.data==1)
            {
                one++;
            }
            else if(curr.data==2)
            {
                two++;
            }

            curr=curr.next;
        }

        curr=head;

        while (curr!=null)
        {
            if(zero!=0)
            {
                curr.data=0;
                zero--;
            }
            else if(one!=0)
            {
                curr.data=1;
                one--;
            }
            else if(two!=0)
            {
                curr.data=2;
                two--;
            }
            curr=curr.next;
        }

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
        Node head=new Node(1);
        Node temp2=new Node(0);
        Node temp3=new Node(2);
        Node temp4=new Node(1);
        Node temp5=new Node(0);
        Node temp6=new Node(2);
        
        head.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5; 
        temp5.next=temp6;

        System.out.println("original list");
        rPrint(head);
        
        System.out.println("sorted list Naive Sol");
        naiveSort(head);
        rPrint(head);

        System.out.println("sorted list Efficient Sol");
        effSort(head);
        rPrint(head);
    }

}
