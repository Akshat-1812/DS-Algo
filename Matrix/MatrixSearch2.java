package Matrix;

/**
 * Search in row-wise and column-wise sorted array
 */

public class MatrixSearch2
{
    public static void search(int ar[][],int x)
    {
        int rowIndex=0,colIndex=ar[0].length-1;

        if(ar[0][0]>x)
        {
            System.out.println("Element not found");
            return;   
        }
        else if(ar[colIndex][colIndex]<x)
        {
            System.out.println("Element not found");
            return;   
        }

        while(rowIndex<ar.length && colIndex>=0)
        {
            if(ar[rowIndex][colIndex]==x)
            {
                System.out.println("Element found at "+rowIndex+" , "+colIndex);
                return;   
            }
            else if(ar[rowIndex][colIndex]>x)
            {
                colIndex--;
            }
            else
            {
                rowIndex++;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args)
    {
        int ar[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
            };
        int x=15;

        search(ar,x);   
    }
}
