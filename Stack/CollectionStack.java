import java.util.ArrayDeque;
//import java.util.Stack;

public class CollectionStack 
{
    public static void main(String[] args) 
    {
        //stack creation 
        //Stack s1 = new Stack();

        //Stack<Integer> s1 = new Stack<>(); //thread safe
        ArrayDeque<Integer> s1 = new ArrayDeque<>(); //not thread safe

        //push
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        //pop
        s1.pop();
        
        System.out.println("Top element "+s1.peek());

        System.out.println("size "+ s1.size());

        System.out.println("empty "+ s1.isEmpty());


    }    
}
