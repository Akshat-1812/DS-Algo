import java.util.Stack;

public class RecursiveReverseStack 
{
    private static void insertAtBottom(Stack<Integer> st, int x) 
    {
        //base case
        if (st.isEmpty()) 
        {
            st.push(x);
            return;
        }

        //pop the top
        int val = st.pop();

        //R C
        insertAtBottom(st, x);

        //add the extracted val
        st.push(val);
        return;
    }    

    private static void reverseStack(Stack<Integer> ast) 
    {
        //base case
        if(ast.isEmpty())
        {
            return;
        }

        // extract element
        int rem = ast.pop();

        // reverse R C
        reverseStack(ast);

        //insert at bottom
        insertAtBottom(ast,rem);
    } 

    public static void main(String[] args) 
    {
        Stack<Integer> ast = new Stack<>();
        
        ast.push(1);
        ast.push(2);
        ast.push(3);
        ast.push(4);
        ast.push(9);

        System.out.println("BEFORE "+ ast);

        reverseStack(ast);

        System.out.println("AFTER "+ast);
        
    }
   
}
