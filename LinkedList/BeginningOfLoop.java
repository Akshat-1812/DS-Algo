/**
 * remove and detect loop --> part-2
 
 * Find the start point of loop
 * 
 * I/P A->B->C->D-->E-->C
 * O/P C
 */

public class BeginningOfLoop
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
        //remove function call & uncomment this code for less modular
        // Node fast=head;

        // while(slow!=null && fast!=null )
        // {
        //     fast=fast.next; 

        //     if (fast!=null)
        //     {
        //         fast=fast.next;
        //     }

        //     slow=slow.next;

        //     if(slow==fast)
        //     {
        //         System.out.println("loop is present ");
        //         break;
        //         //return slow;
        //     }
        // }

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

       return slow;
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
        
        Node res=floydBeginningOfLoop(head);

        if (res!=null)
        {
            System.out.println("loop starts at "+res.data);    
        } else
        {
            System.out.println("there is no loop");    
        }
        
    }

}
