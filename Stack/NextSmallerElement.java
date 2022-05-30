/**
 *  Find next smaller element in O(n);
 * 
 * I/P : [2,1,4,3]
 * O/P : [1,-1,3,-1]
 * 
 * Note : find smaller number to its right & if not found add -1 in res[]
 */

import java.util.Stack;

public class NextSmallerElement 
{
    private static int[] nextSamller(int[] arr) 
    {
        Stack<Integer> ast = new Stack<>();
        int res[] = new int[arr.length];

        ast.push(-1);

        for (int i = arr.length-1; i >=0 ; i--) 
        {
            int curr = arr[i];

            while( curr <= ast.peek()) 
            {
                ast.pop();
            }

            // ans is stack top()
            res[i] = ast.peek();

            ast.push(curr);
        }

        return res;
    }  

    public static void main(String[] args) 
    {
        int arr[] = {2,1,4,3};

        int res[] = nextSamller(arr);

        for (int i : res) {
            
            System.out.println(i + " ");
        }
        
    }
}
