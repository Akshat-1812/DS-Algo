import java.util.Stack;

public class ValidParentheses 
{

    private static int makeValide(String s1) 
    {

        if(s1.length() % 2 == 1) //odd length
        {
            return -1;
        }

        Stack<Character> ast = new Stack<>();

        for (int i = 0; i < s1.length(); i++) 
        {
            char ch = s1.charAt(i);

            if(ch == '{')
            {
                ast.push(ch);
            }
            else
            {
                //we found closing bracket right after opening
                if( !ast.isEmpty() && ast.peek() == '{')
                {
                    ast.pop(); //pop it because it is valid 
                }
                else
                {   
                    ast.push(ch);
                }
            }
        }

        //stack contains invalid expression
        //count open and close brackets
        int  a = 0,b = 0;

        while ( !ast.isEmpty() ) 
        {
            if(ast.peek() == '{') //count open brakctes
            {
                b++;
            }
            else //count close brakctes
            {
                a++;
            }

            ast.pop();
        }

        int res = (a+1)/2 + (b+1)/2;

        return res;
    }   

    public static void main(String[] args) 
    {
        String s1 = "}}}{";

        int res = makeValide(s1);

        System.out.println("cost : "+ res);
    }
 
}
