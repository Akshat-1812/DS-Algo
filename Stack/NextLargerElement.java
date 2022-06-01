/**
 * Find next Smaller element
 * I/P : [1,3,0,2,1]
 * O/P : [3,4,2,-1,-1]
 */

import java.util.Stack;

public class NextLargerElement 
{

    public static long[] nextLarger(long[] arr, int n)
    { 
        Stack<Long> ast = new Stack<>();
        long res[] = new long[arr.length];
        
        res[n-1] = -1;
        
        ast.push(arr[n-1]);
        
        for(int i=arr.length-2; i>=0 ; i--)
        {
            long curr = arr[i];
            
            while( !ast.isEmpty() && ast.peek()<=curr )
            {
                ast.pop();
            }
            
            if(ast.isEmpty())
            {
                res[i] = -1;
            }
            else
            {
                res[i] = ast.peek();
                
            }
            
            ast.push(curr);
        }
        
        return res;
    } 

    public static void main(String[] args) 
    {
        long arr[] = {2,1,4,3};

        long res[] = nextLarger(arr,arr.length);

        for (long i : res) {
            
            System.out.println(i + " ");
        }
        
    }
}
