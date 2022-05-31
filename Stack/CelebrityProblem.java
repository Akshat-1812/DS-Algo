/**
 * A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Note: Follow 0 based indexing.

Example 1:

Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity. 

 */


import java.util.Stack;

public class CelebrityProblem 
{
    private static boolean verifyCelebrity(int[][] party, Stack<Integer> ast) 
    {
        int candidate = ast.pop();

        //row check
        for (int i = 0; i < party.length; i++) 
        {
            if (party[candidate][i] != 0) 
            {
                return false;
            }
        }

        //column check
        for (int i = 0; i < party.length; i++) 
        {
            if(i != candidate)
            {
                if(party[i][candidate] !=1)
                {
                    return false;
                }    

            }
        }

        return true;
    }

    private static int isCelebrity(int[][] party) 
    {
        //step 1 Create Stack
        Stack<Integer> ast = new Stack<>();

        //step2 : push all index in stack
        for (int i = 0; i < party.length; i++) 
        {
            ast.push(i);
        }

        //step3 : pop() until stack size is !=1
        while ( ast.size() > 1 ) 
        {
            int a = ast.pop();
            int b = ast.pop();

            if(party[a][b] == 1) // A knows B
            {
                ast.push(b);
            }
            else     // B knows A
            {
                ast.push(a);
            }
        }

        int res = ast.peek();
        
        //step4 : verify celebrity
        boolean flag = verifyCelebrity(party, ast);

        if(flag)
        {
            return res;
        }

        return -1;
    }


    public static void main(String[] args) 
    {
        // int party[][] = {
        //                     {0,1,0},
        //                     {0,0,0},
        //                     {0,1,0},
        //                 };

        int party[][] = {
            {0,1},
            {1,0}
        };

        int res = isCelebrity(party);

        System.out.println("crlebrity Is = "+ res);
    }

}
