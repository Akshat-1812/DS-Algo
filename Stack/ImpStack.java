//program to create stack and add ,delete,retrive top & print from stack
class Stack
{
    static final int max=1000;//size of stack
    int top;
    int ar[]=new int[max];

    Stack()
    {
        top=-1;
    }

    boolean push(int x)
    {
        if(top>=max-1) //overflow
        {
            System.out.println("Overflow");
            return false;
        }
        else
        {
            ar[++top]=x;
            System.out.println("Pushed :  "+x);
            return true;
        }
    }

    int pop()
    {
        if(top<0)
        {
            System.out.println("Underflow");
            return 0;
        }
        else
        {
            int x=ar[top--];
            return x;
        }
    }

    int peek()
    {
        if(top<0)
        {
            System.out.println("Underflow");
            return 0;
        }
        else
        {
            int x=ar[top];
            return x;
        }
    }

    void print()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(ar[i]);

        }
    }

}

class ImpStack
{
    public static void main(String...args)
    {
        Stack s1=new Stack();

        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println("Element poped  " + s1.pop());

        System.out.println("New Top Element  " + s1.peek());

        System.out.println("Element present in Stack :");
        s1.print();
    }
}