/**
 * Sort the stack
 * I/P : 5,4,9,-2
 * O/P : -2,4,5,9
 */

import java.util.Stack;

public class SortStack 
{
    private static void sortedInsert(Stack<Integer> ast, int rem) 
    {
        //base case
        if( ast.isEmpty() || (!ast.isEmpty() && ast.peek()<rem) )
        {
            ast.push(rem);
            return;
        }

        //extract val
        int num = ast.pop();

        //R.C
        sortedInsert(ast, rem);

        //add value when return
        ast.push(num);

    }


    private static void sortStack(Stack<Integer> ast) 
    {
        //base case
        if (ast.isEmpty()) 
        {
            return;    
        }

        //extrat val
        int rem = ast.pop();
        
        //R.C
        sortStack(ast);

        //do sorted insert
        sortedInsert(ast ,rem);

    }    


    public static void main(String[] args) 
    {
        Stack<Integer> ast = new Stack<>();
        
        ast.push(3);
        ast.push(3);
        ast.push(-2);
        ast.push(5);
        ast.push(9);

        System.out.println("before "+ ast);

        sortStack(ast);

        System.out.println("after "+ ast);
    }

}
