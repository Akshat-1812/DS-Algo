class Node
{
    int data;
    Node next;
    Node child;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.child = null;
        
    }
}

public class Flatten 
{
    private static Node merge(Node left, Node right) 
    {
        Node temp=new Node(1);
		Node res=temp;
		while(left!=null && right!=null)
		{
			if(left.data <= right.data)
			{
				temp.child=left;
				left=left.child;
				temp=temp.child;
				temp.next=null;
			}
			else
			{
				temp.child=right;
				right=right.child;
				temp=temp.child;
				temp.next=null;
			}
		}
		if(left!=null)
			temp.child=left;
		if(right!=null)
			temp.child=right;
	return res.child;
    }

    private static Node flatten(Node head) 
    {
        if (head == null || head.next == null) 
        {
            return head;    
        }

        Node down = head;
        //down.next = null;

        Node right = flatten(head.next);

        Node res = merge(down,right);

        return res;
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
        //next
        Node head = new Node(1);
        Node temp2 = new Node(4);
        Node temp3 = new Node(7);
        Node temp4 = new Node(9);
        Node temp5 = new Node(20);

        //next
        head.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;

        //child
        Node c_head1 = new Node(2);
        Node c_head2 = new Node(3);
        Node c_head3 = new Node(4);

        head.child = c_head1;
        c_head1.child = c_head2;
        c_head2.child = c_head3;

        
        Node c_temp1 = new Node(12);

        temp3.child = c_temp1;

        System.out.println("function called");
        
        Node res = flatten(head);

        System.out.println("output ");
        rPrint(res);


    }
 
}
