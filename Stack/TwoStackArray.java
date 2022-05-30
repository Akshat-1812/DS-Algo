/*
Create 2 stack in one array
stack1 insert left to right
stack2 insert right to left
*/
class MyTwoStack
{
    int arr[];
    int top1,top2;
    int cap;

    MyTwoStack(int cap)
    {
        this.cap = cap;
        top1 = -1;
        top2 = cap;
        arr = new int[cap];
    }

    public void push1(int x)
    {
        //at least 1 empty space present
        if (top2 - top1 > 1) 
        {
            arr[++top1] = x;
        }
        else
        {
            System.out.println("overflow "+x);
        }
    }

    public void push2(int x) 
    {
        if(top2 - top1 > 1)
        {
            arr[--top2] = x;
            return;
        }
        else
        {
            System.out.println("overflow "+ x);
        }
    }

    public int pop1() 
    {
        if(top1>=0)
        {
            int res = arr[top1--];
            return res;
        }
        else
        {
            System.out.println("Underflow ");
            return Integer.MIN_VALUE;
        }
    }

    public int pop2() 
    {
        if(top2<cap)
        {
            int res = arr[top2++];
            return res;
        }
        else
        {
            System.out.println("Underflow ");
            return Integer.MIN_VALUE;
        }
    }

    public int peek1()
    {
        if(top1>=0)
        {
            int res = arr[top1];
            return res;
        }
        else
        {
            System.out.println("Underflow ");
            return Integer.MIN_VALUE;
        }
    }

    public int peek2() 
    {
        if(top2<cap)
        {
            int res = arr[top2];
            return res;
        }
        else
        {
            System.out.println("Underflow ");
            return Integer.MIN_VALUE;
        }
    }

}

public class TwoStackArray 
{
    public static void main(String[] args) 
    {
        MyTwoStack s1=new MyTwoStack(5);

        s1.push1(10);
        s1.push2(20);
        s1.push1(30);
        s1.push1(40);
        s1.push2(50);

        System.out.println("pop1 : " + s1.pop1());
        System.out.println("pop2 : " + s1.pop2());

        System.out.println("peek1 : " + s1.peek1());
        System.out.println("peek2 : " + s1.peek2());

    }    
}
