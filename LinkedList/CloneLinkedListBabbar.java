//this code is by love babbar

class MyNode
{
    int data;
    MyNode next;
    MyNode random;

    MyNode(int data)
    {
        this.data=data;
    }
}

public class CloneLinkedListBabbar 
{
    static MyNode cloneHead = null;
    static MyNode cloneTail = null;
    
    private static void insertAtTail(MyNode newHead,MyNode newTail,int data) 
    {
        MyNode newNode = new MyNode(data);

        if (cloneHead==null)
        {
            cloneHead = newNode;    
            cloneTail = newNode;    
        } 
        else 
        {
            cloneTail.next = newNode;
            cloneTail=newNode;    
        }
    }

    private static MyNode copyList(MyNode head) 
    {
        //step1: create a clone list
        // MyNode cloneHead=null;
        // MyNode cloneTail=null;
        // cloneHead=null;
        // cloneTail=null;

        MyNode temp =head;

        while (temp!=null)
        {
            insertAtTail(cloneHead,cloneTail,temp.data);
            //insertAtTail(temp.data);
            temp=temp.next;
        }
        
        //step2: clone node add in between original node
        MyNode originalNode = head;
        MyNode cloneNode = cloneHead;
        
        
        while (originalNode != null && cloneNode != null)
        {
            MyNode forward = originalNode.next;
            originalNode.next = cloneNode;
            originalNode = forward;

            forward = cloneNode.next;
            cloneNode.next = originalNode;
            cloneNode = forward;
        }

        //step3: revert changes in clone code
        temp = head;

        while (temp != null)
        {
            temp.next.random = temp.random != null ? temp.random.next : temp.random; 
            // if(temp.next != null)
            // {
            //     if(temp.random != null)
            //     {
            //         temp.next.random = temp.random.next;    
            //     }
            //     else
            //     {
            //         //means temp.next = null
            //         temp.next=temp.random;
            //     }
            // }
            temp = temp.next.next;

        }

        //step4: revert changes in done in step2
        originalNode = head;
        cloneNode = cloneHead;
        
        while (originalNode != null && cloneNode != null)
        {   
            originalNode.next = cloneNode.next;
            originalNode = originalNode.next;
            
            if (originalNode!= null) 
            {
                cloneNode.next = originalNode.next;
            }

            cloneNode = cloneNode.next;
        }

        //step5: return clone node
        return cloneHead;
    }

    public static void rPrint(MyNode head) //print linked list recursively
    {
        MyNode n=head;
        
        while (n != null)
        {
            System.out.print("Data = "+n.data+" ");
            if(n.random!=null)
            {
                System.out.println(", Random = "+n.random.data);
            }
            
            System.out.println();
            
            n = n.next;
        }
       System.out.println();
        return;
    }

    public static void main(String[] args) 
    {
        MyNode head=new MyNode(1);
        MyNode temp2=new MyNode(2);
        MyNode temp3=new MyNode(3);
        MyNode temp4=new MyNode(4);
        //MyNode temp5=new MyNode(5);
        
        //next pointer List
        head.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        //temp4.next=temp5;

        //random pointer List
        head.random=temp2;
        temp2.random=temp4;
        //temp3.random=temp5;
        //temp4.random=temp3;
        // temp5.random=temp2;

        System.out.println("original list ");
        rPrint(head);

        //System.out.println("Akshat...");
        MyNode res = copyList(head);

        System.out.println("Copy list ");
        rPrint(res);
    }    
}
