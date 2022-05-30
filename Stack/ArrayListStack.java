import java.util.ArrayList;

class MyStack
{
    ArrayList <Integer> als = new ArrayList<>();
    int top=-1;
    int curr = 0;

    public void push(int x) 
    {
        top++;
        als.add(x);
    }

    public int pop() 
    {
        top--;

        int res = als.get(als.size()-1);
        als.remove(als.size()-1);

        return res;
    }

    public int peek() 
    {
        if (als.size()==0) 
        {
            System.out.println("underflow");
            return Integer.MIN_VALUE;
        }

        return als.get(als.size()-1);
    }  

    public int size()
    {
        return als.size();
    }

    public boolean isEmpty() 
    {
        return als.isEmpty();    
    }

}

public class ArrayListStack 
{
    public static void main(String[] args) 
    {
        MyStack s1 = new MyStack();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        System.out.println("poped "+ s1.pop());

        System.out.println("current element "+ s1.peek());

        System.out.println("isEmpty "+ s1.isEmpty());

    }
  
}
