import java.util.Stack;

public class BalancedParentheses 
{

    private static boolean isBalanced(String s1) 
    {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s1.length(); i++) 
        {
            char ch = s1.charAt(i);

            //if its opening bracket, stack push
            //if its is closing bracket , check top, & pop

            if (ch == '(' || ch == '{' || ch == '[') 
            {
                st.push(s1.charAt(i));
            } 
            else 
            {
                // if closing bracket

                if(!st.isEmpty())
                {
                    //stack ka top
                    char stTop = st.peek();

                    //match with closing bracket of string
                    if( (stTop == '(' && s1.charAt(i) == ')') || 
                        (stTop =='{' && s1.charAt(i) == '}' ) ||
                        (stTop == '[' && s1.charAt(i) == ']') )
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }//loop ends

        //after all the processing stack is empty or not
        if (st.isEmpty()) 
        {
            return true;
        }
        else
        {
            return false;
        }

    } 

    public static void main(String[] args) 
    {
        // String s1 = "[({})]";
        // String s1 = "{}([)()]";
        String s1 = "{()";

        boolean res = isBalanced(s1);

        System.out.println("res = "+ res);
    }
  
}
