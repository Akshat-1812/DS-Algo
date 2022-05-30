/**
 *  if string is redudent  return true else false
 * 
 * I/P : (a+b)
 * O/P : false
 * 
 * I/P : ((a+n))
 * O/P : true
 * 
 * Note : if it voilate mathematics way for using brackets in expression
 * it is redudent 
 */

import java.util.Stack;

public class RedudentBrackets 
{
    private static boolean findRedudent(String s1) 
    {
        Stack<Character> ast = new Stack<>();

        for (int i = 0; i < s1.length(); i++) 
        {
            char ch = s1.charAt(i);

            if (ch == '('|| ch == '+'|| ch == '-'|| ch == '*'|| ch == '/' )
            {
                ast.push(ch);
            }
            else
            {
                // ch ya agar ')'

                if(ch == ')')
                {
                    boolean isredudant = true;

                    while (ast.peek() != '(') 
                    {
                        char top = ast.peek();

                        if(top == '+'|| top == '-'|| top == '*'|| top == '/')
                        {
                            isredudant = false;
                        }

                        ast.pop();
                    }//while end

                    if(isredudant == true)
                    {
                        return true; // it is redudent 
                    }

                    ast.pop(); //to remove the opening bracket '('
                }

            }//else end

        }//for end

        return false;
    }   

    public static void main(String[] args) 
    {
        String s1= "(a+b*(c+d))";
        
        boolean res = findRedudent(s1);

        System.out.println(res);
    }

}
