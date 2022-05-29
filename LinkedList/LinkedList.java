// program to understand how to create a linkedlist

class LinkedList
{
    Node head; //head of the list

    static class Node //static so main() can access it.
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public static void main(String...agrs)
    {
        LinkedList list=new LinkedList();
        //create 3 node 
        //first node is head 
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        /* three node have allocated dynamically

            list.head
                |
                |
            +---+------+                
            | 1 | null |                 
            +---+------+                
        */

        list.head.next = second; //this is how we connect one node with another

         /* three node have allocated dynamically

            list.head        second
                |               |
                |               |
            +---+----+     +----+------+          
            | 1 | o------->|  2  | null |       
            +---+----+     +----+------+           
        */

        second.next=third; //link 2nd node with 3rd
        /* list.head        second              second
                |               |                   |
                |               |                   |
            +---+----+     +----+----+       +----+------+
            | 1 | o------->|  2  | o-------->| 3  | null |
            +---+----+     +----+----+       +----+------+ 
        */   
    }
}