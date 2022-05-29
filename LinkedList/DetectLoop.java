import java.util.HashMap;
import java.util.Map;

/**
 * remove and detect loop --> 1 part
 * I/P A->B->C->D-->E-->C
 * O/P true
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


public class DetectLoop
{
    //naive method
    private static boolean dCheck(Node head)
    {
        if(head==null)
        {
            return true;
        }

        Map<Node, Boolean> visited= new HashMap<>();

        Node temp=head;

        while (temp!=null)
        {
            if(visited.containsKey(temp)==true)
            {
                System.out.println("loop present at "+temp.data+" ");
                return true;
            }
            
            visited.put(temp, true);
            
            temp=temp.next;   
        }
        
        
        return false;
    }   
    
    // Effiecient approach
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
                System.out.println("loop is present "+ slow.data);
                return slow;
            }
        } 

        return null;
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
        
        if(dCheck(head))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }   


        System.out.println("Floyed method ..........");
        Node res=floydCheck(head);

        if(res==null)
            System.out.println("loop is not present");
            
    }


}
