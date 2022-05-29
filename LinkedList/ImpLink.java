//generic code for insert & delete
public class ImpLink
{
    Node head;

    class Node
    {
        int d;
        Node next;

        Node(int d)
        {
            this.d=d;
            this.next=null;
        }
    }
//-------------- Insertion------------------------//

    public void insertB(int data)
    {
        Node new_N= new Node(data);//create & init node

        new_N.next=head; //store old first block ref. in new node

        head=new_N; // head me new node ka ref.
    }

    public void insertAtPos(int data,int pos)
    {
        int count=0;

        if(head==null)
        {   
            head=new Node(data);
            return;
        }

        Node n=head;

        while (count!=pos-2)//pos-2 because start from head
        {
            n=n.next;
            count++;
        }

        Node new_Node = new Node(data);

        // if(n.next==null)//if pos last hai 
        // {
        //     System.out.println("Cannot insert");
        //     return;
        // }

        //prev node k next ka ref. new node k next me
        new_Node.next=n.next; 

        n.next=new_Node; //prev node k next me new node ka ref.
        
    }

    public void insertEnd(int data)
    {
        Node new_n=new Node(data); //new node bnao

        if(head==null)//head null hai toh bignning
        {
            head=new Node(data);
            return;
        }

        Node n=head;

        while(n.next!=null) // go to last node
        {
            n=n.next;
        }

        n.next=new_n; // new node ka ref. last node me dalo
        new_n=null;
        return;
    }
//-------------- Insertion-End -----------------------//

//-------------- Deletion -----------------------//

    public void deleteNode(int key)
    {
        // Store head node
         Node temp = head, prev = null;
 
         // If head node itself holds the key to be deleted
         if (temp != null && temp.d == key) {
             head = temp.next; // Changed head
             return;
         }
  
         // Search for the key to be deleted, keep track of
         // the previous node as we need to change temp.next
         while (temp != null && temp.d != key) {
             prev = temp;
             temp = temp.next;
         }
  
         // If key was not present in linked list
         if (temp == null)
             return;
  
         // Unlink the node from linked list
         prev.next = temp.next;
    }


    public void printList()
    {
        Node n=head;
        while (n!=null)
        {
            System.out.print(n.d+"-> ");
            n=n.next;
        }
    }

    public static void main(String[] args)
    {
        ImpLink l1=new ImpLink();

        //insert at start
        l1.insertB(10);
        //l1.printList();
        
        l1.insertB(20);
        //l1.printList();
        
        //insert at end
        l1.insertEnd(30);
        
        l1.insertAtPos(25,2); //pos start from 1 and 3 means add element after 20
        l1.printList();
        
        System.out.println("LinkedList deletion........");

        l1.deleteNode(20);
        l1.printList();
    }

}
