public class DoublyLinkedList
{
    Node head;

    public class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
            data=d;
        }
    }

    void insertB(int data)
    {
        //System.out.print("aks2...........");
        //new node & init.
        Node node1 = new Node(data);

        //new node k next me head ka ref.
        node1.next=head;
        node1.prev=null;

        //agar head null nhi hai matlb linked list empty nhi hai
        //tb head k prev me new node ka ref.
        if(head!=null)
        {
            head.prev=node1;
        }

        //head ko update kr do
        head=node1;
    }

    void insertAtPos(int data,int pos)
    {
        Node node1 = new Node(data);

        if(head==null)
        {
            node1.prev = null;
            head = node1;
            return;
        }

        Node n=head;
        // int count=1;
        int count=0;

        while (count!=pos)
        {
            n=n.next;
            count++;
        }

        if(n.next==null)
        {
            //last k next me new node ka ref.
            n.next=node1;
            // new node k previous me last ka ref.
            node1.prev=n;
            return;
        }

        //new node k next me n ka next
        node1.next=n.next;

        //n k next ka previous ka ref me node1 k ref
        n.next.prev=node1;

        //n k next me node1 ka ref.
        n.next=node1;

        //node1 k prev me ka next ref.
        node1.prev=n;

    }

    void insertEnd(int data)
    {
        //new node bnao 
        Node node1=new Node(data);
        
        //agar linkedlist empty hai 
        if(head==null)
        {
            node1.prev = null;
            head = node1;
            return;
        }

        //else last node tk traverse kro
        Node last=head;

        while(last.next!=null)
        {
            last=last.next;
        }

        //last k next me new node ka ref.
        last.next=node1;
        // new node k previous me last ka ref.
        node1.prev=last;

        return;
    }

    public void deleteNode(int key)
    {
        // Store head node
         Node temp = head, prev1 = null;
 
         // If head node itself holds the key to be deleted
         if (temp != null && temp.data == key) {
             head = temp.next; // Changed head
             return;
         }
  
         // Search for the key to be deleted, keep track of
         // the previous node as we need to change temp.next
         while (temp != null && temp.data != key) {
             prev1 = temp;
             temp = temp.next;
         }
  
         // If key was not present in linked list
         if (temp == null)
             return;
  
         // Unlink the node from linked list
         prev1.next = temp.next;

         temp.next.prev=prev1;
    }

    void printLis()
    {
        Node n=head;

        while(n!=null)
        {
            System.out.print(n.data+"-> ");
            n=n.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoublyLinkedList dl=new DoublyLinkedList();

        
        dl.insertB(10);
        dl.insertB(20);
        
        dl.printLis();
        
        System.out.println("------End-------");
        
        dl.insertEnd(30);
        dl.printLis();

        System.out.println("------Pos------");
        dl.insertAtPos(25, 1); //indexing start from 0
        dl.printLis();

        dl.deleteNode(25);
        System.out.println("------After Del------");
        dl.printLis();

    }
    
}
