package Matrix;
/*
Rotate a marix by 90 to the left

last col -> 1st row
2nd last col -> 2nd row
.
.
1st col -> last row

My Solution

for (int i = 0; i < ar.length; i++)
{
    int c=0;
    for (int j = 0; j < ar.length; j++)
    {
        temp[c][i]=ar[i][j];
        c++;
    }   
}    

*/


// Naive solution --> O(n^2)
public class RotateLeft
{
    public static int[][] rotate90(int ar[][])
    {
        int temp[][] = new int[ar.length][ar.length];

        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar.length; j++)
            {
                temp[i][j]=ar[j][ar.length-i-1];
            }   
        }    

        return temp;
    }

    public static void main(String[] args)
    {
        int ar[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        int temp[][] = rotate90(ar);

        for (int i = 0; i < temp.length; i++) {
            
            for (int j = 0; j < temp[0].length; j++) {
                
                System.out.print(temp[i][j]+" ");
            }

            System.out.println();
        }
        
    }    
}
