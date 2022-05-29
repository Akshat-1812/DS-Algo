/**
 * Sort Linked list using merge sort without replacing data
 * Time --> O(nlogn)
 * Space --> O(logn)
 */

public class MergeSortLL 
{
    private static Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;   
        }

        return slow;        
    }

    private static Node merge(Node left, Node right) 
    {

        if (left == null) 
        {
            return right;   
        }
        else if (right == null) 
        {
            return left;    
        }

        //create a dummy node;
        Node ans = new Node(-1);
        Node temp = ans;

        //merge to sorted LL
        while (left != null && right != null) 
        {
            if (left.data > right.data)
            {
                temp.next = right;
                temp = right;
                right = right.next;
                
            } 
            else 
            {
                temp.next = left;
                temp = left;
                left = left.next;    
            }    
        }

        while (left != null) 
        {
            temp.next = left;
            temp = left;
            left = left.next;    
        }

        while (right != null) 
        {
            temp.next = right;
            temp = right;
            right = right.next;    
        }

        //remove dummy node {dummy-->left/right}
        ans = ans.next;

        return ans;
    }

    private static Node mergeSort(Node head) 
    {
        //base case
        if (head == null || head.next == null)
        {
            return head;   
        }

        // break LL into 2 halves after finding mid
        Node mid = findMid(head);

        Node left = head;
        Node right = mid.next;
        mid.next = null;

        //recursive call to sort two List

        left = mergeSort(left);
        right = mergeSort(right);

        Node res = merge(left,right);

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
        Node head = new Node(3);
        Node temp2 = new Node(5);
        Node temp3 = new Node(5);
        Node temp4 = new Node(2);
        Node temp5 = new Node(9);

        head.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;

        System.out.println("original list ");
        rPrint(head);

        //System.out.println("Akshat...");
        Node res = mergeSort(head);

        System.out.println("Sorted List");
        rPrint(res);
    }
}
