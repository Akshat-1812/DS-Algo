package Matrix;

/**
 in Transpose diagonal elements remain unchanged and upper and  lower triangle swapps.
 */

public class Transpose
{
    static void transposeM(int ar[][])
    {   
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = i+1; j < ar[0].length; j++)
            {
                if (i!=j)
                {
                    int temp=ar[i][j];
                    ar[i][j]=ar[j][i];
                    ar[j][i]=temp;
        
                }    
            }    
        }
        
    }

    public static void main(String[] args)
    {
        int ar[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
            };

        transposeM(ar);
        
        for (int i = 0; i < ar.length; i++) {
            
            for (int j = 0; j < ar[0].length; j++) {
                
                System.out.print(ar[i][j]+" ");
            }

            System.out.println();
        }
        
    }
}
