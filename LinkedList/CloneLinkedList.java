//the commeted code is also correct(My code) 
// This will not work on GFG
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

public class CloneLinkedList 
{
    static MyNode cloneHead,cloneTail;

    private static void insertAtTail(MyNode newHead,MyNode newTail,int data) 
    {
        MyNode temp = new MyNode(data);

         if (cloneHead == null)//when list is empty
        {
            cloneHead=temp;
            cloneTail=temp;
            
        }
        else
        {
            cloneTail.next=temp;
            cloneTail=temp;
            
        }

        // if(cloneHead == null)
        // {
        //     cloneHead=new MyNode(data);
        //     return;
        // }

        // MyNode n=cloneHead;

        // while(n.next!=null)
        // {
        //     n=n.next;
        // }

        // n.next=temp;
        // return;
        
    }

    private static MyNode copyList(MyNode head) 
    {
        MyNode n=head;

        while(n!=null)
        {
            // insertAtTail(n.data);
            insertAtTail(cloneHead,cloneTail,n.data);
            n = n.next;
        }

        n=head;
        MyNode clonePt = cloneHead;

        while (n!=null)
        {
            clonePt.random = n.random;
            clonePt = clonePt.next;
            n = n.next;
        }
    
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
        // MyNode temp5=new MyNode(5);
        
        //next pointer List
        head.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        // temp4.next=temp5;

        //random pointer List
        head.random=temp2;
        temp2.random=temp4;
        // temp3.random=temp5;
        // temp4.random=temp3;
        // temp5.random=temp2;

        System.out.println("original list ");
        rPrint(head);

        MyNode res = copyList(head);

        System.out.println("Copy list ");
        rPrint(res);

    }

}
