
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}

class MyLLStack 
{
    Node head;
    int size;

    MyLLStack()
    {
        head = null;
        size = 0;
    }


    public void push(int x) 
    {
        size++;

        Node temp = new Node(x);

        temp.next = head;

        head = temp;

        return;
    }

    public int pop() 
    {
        if (head == null) 
        {
            System.err.println("underflow");
            return Integer.MIN_VALUE;
        }

        size--;

        int res = head.data;

        head = head.next;

        return res;
    }

    public int peek() 
    {
        if (head == null) 
        {
            System.err.println("underflow");
            return Integer.MIN_VALUE;
        }

        return head.data;
        
    }

    public boolean isEmpty() 
    {
        return head==null;
    }

    public int size() 
    {
        return size;    
    }

    
}

public class LinkedListStack 
{
    public static void main(String[] args) 
    {
        MyLLStack s1 = new MyLLStack();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        System.out.println("poped "+ s1.pop());

        System.out.println("current element "+ s1.peek());

        System.out.println("isEmpty "+ s1.isEmpty());

        System.err.println("size " + s1.size());

    }    
}
