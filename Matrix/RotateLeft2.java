package Matrix;

/**
 * first transpose the matrix
 * then reverse column 
 */
// Time -> O(n)

public class RotateLeft2
{
    public static void swap(int mat[][],int i,int low,int high)
    {
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
    }

    public static void rotate90(int ar[][])
    {
        // transpose;
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = i+1; j < ar[0].length; j++)
            {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }   
        }

        for (int i = 0; i < ar.length; i++)
        {
            int low=0, high=ar.length-1;

            while(low<high)
            {
                swap(ar,i,low,high);

                low++;
                high--;
            }
            
        }

    }

    
    public static void main(String[] args)
    {
        // int ar[][]={
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        //     };

        int ar[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        rotate90(ar);   

        for (int i = 0; i < ar.length; i++) {
            
            for (int j = 0; j < ar[0].length; j++) {
                
                System.out.print(ar[i][j]+" ");
            }

            System.out.println();
        }
    }
}
