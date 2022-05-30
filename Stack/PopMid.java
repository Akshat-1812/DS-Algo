import java.util.Stack;

/**
 * Find Mid and delete it
 */

public class PopMid 
{

    private static void popMid(Stack<Integer> s1, int count,int size) 
    {
        //base case
        if (count == size/2) 
        {
            s1.pop();
            return;    
        }

        int rem = s1.pop();

        //Recursive call
        popMid(s1, count+1,size);

        s1.push(rem);
    }  

    public static void main(String[] args) 
    {
        Stack<Integer> s1 = new Stack<>();

        s1.push(4);
        s1.push(8);
        // s1.push(12);
        s1.push(9);
        s1.push(5);

        int count = 0;

        // System.out.println("size "+s1.size());
        // System.out.println("half "+s1.size()/2);
        // System.out.println("half "+s1.get(2));

        popMid(s1,count,s1.size());

        System.out.println(s1);
        
    }

}
