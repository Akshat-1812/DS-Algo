/**
 * Given a binary matrix M of size n X m. Find the maximum area of a rectangle formed only of 1s in the given matrix.
 * 
 * Example 1:
 * Input:
n = 4, m = 4
M[][] = {{0 1 1 0},
         {1 1 1 1},
         {1 1 1 1},
         {1 1 0 0}}
Output: 8
Explanation: For the above test case the
matrix will look like
0 1 1 0
1 1 1 1
1 1 1 1
1 1 0 0
the max size rectangle is 
1 1 1 1
1 1 1 1
and area is 4 *2 = 8.
 */

import java.util.Stack;

public class MaxRectangleMatrix 
{
    private static int[] nextSmallerElement(int[] arr) 
    {    
        Stack<Integer> ast = new Stack<>();
        int res[] = new int[arr.length];

        ast.push(-1);

        for (int i = arr.length-1; i >=0 ; i--) 
        {
            int curr = arr[i];

            while( ast.peek() != -1 && curr <= arr[ast.peek()]) 
            {
                ast.pop();
            }

            // ans is stack top()
            res[i] = ast.peek();

            ast.push(i);
        }

        return res;
    }

    private static int[] previousSmallerElement(int[] arr) 
    {
        Stack<Integer> ast = new Stack<>();
        int res2[] = new int[arr.length];

        ast.push(-1);

        for (int i = 0; i <arr.length ; i++) 
        {
            int curr = arr[i];

            while( ast.peek() != -1 && curr <= arr[ast.peek()]) 
            {
                ast.pop();
            }

            // ans is stack top()
            res2[i] = ast.peek();

            ast.push(i);
        }

        return res2;
        
    }

    private static int largestRectangularArea(int[] heights) 
    {
        int next[] = new int[heights.length];
        next = nextSmallerElement(heights);

        int prev[] = new int[heights.length];
        prev = previousSmallerElement(heights);

        int area = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length; i++)
        {
            int l = heights[i];

            if (next[i] == -1)
            {
                next[i] = heights.length;
            }
            
            int b = next[i] - prev[i] - 1;

            int newArea = l*b;

            area = Math.max(area, newArea);
        }

        return area;
    }    

    //for each array we call LargestRectuangularAreaInHistorgram
    private static int maxArea(int[][] max) 
    {
        int n = max.length; //row
        int m = max[0].length;//col

        //step1 compute 1st row
        int area = largestRectangularArea(max[0]);

        for (int i = 1; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                //row update by adding privious row value
                if (max[i][j] != 0) 
                {
                    max[i][j] = max[i][j] + max[i-1][j];
                }    
                else
                {
                    max[i][j] = 0;
                }

            }
            
            //entire row is updated now
            area = Math.max(area, largestRectangularArea(max[i]));
        }

        return area;
    }    

    public static void main(String[] args) 
    {
        int max[][] = {
                            {0,1,1,0},
                            {1,1,1,1},
                            {1,1,1,1},
                            {1,1,0,0},
                        };    

        int res = maxArea(max);

        System.out.println("MAX ares "+ res);

    }

    
}
