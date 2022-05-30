import java.util.Stack;

public class LargestRectangularArea 
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

           /* System.out.println(" prev = "+ prev[i]);
            System.out.println(" next = "+ next[i]);
            System.out.println(" b = "+ b);
            */

            int newArea = l*b;

            area = Math.max(area, newArea);
        }

        return area;
    }    

    public static void main(String[] args) 
    {
        // int heights[] = {2,1,5,6,2,3};
        int heights[] = {2,4};
        // int heights[] = {2,2};

        int res = largestRectangularArea(heights);

        System.out.println("Largest : " + res);
    }

    
}
