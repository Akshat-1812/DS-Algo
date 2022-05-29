class ImpLinkedList
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            this.data=d;
            next=null;
        }
    }

    public void printList()
    {
        Node n=head;

        while(n!=null)
        {
            System.out.println(n.data + " ");
            n=n.next;
        }
    }

    public static void main(String[] args)
    {
        ImpLinkedList llist=new ImpLinkedList();

        llist.head=new Node(1);
        Node second=new Node(2);
        Node third = new Node(3);

        llist.head.next=second;//link 1st node with 2nd
        second.next=third;

        llist.printList();
    }
}