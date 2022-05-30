import java.util.Stack;

public class InsertAtBottom 
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

    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<>();
        int x = 10;

        st.push(3);
        st.push(4);
        st.push(5);
        st.push(7);

        System.out.println("Before : "+st);

        insertAtBottom(st,x);

        System.out.println("After : "+st);
        // System.out.println(st.firstElement());
    }

}
