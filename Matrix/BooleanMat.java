package Matrix;

import java.util.Arrays;

public class BooleanMat
{
    public static void makeOne(int temp[][],int idx1,int idx2,int sr,int sc)
    {
        if(idx1==sr)
        {
            for (int i = 0; i < temp[0].length; i++)
            {
                temp[sr][i]=1;
            }
        }

        if(idx2==sc)
        {
            for (int j = 0; j < temp.length; j++)
            {
                temp[j][sc]=1;
            }
        }
    }

    public static int[][] booleanM(int ar[][])
    {
        int row=ar.length;
        int col=ar[0].length;

        int temp[][]=new int[row][col];
        
        for (int[] i : temp)
        {
            Arrays.fill(i, 0);
        }

        int startingRow=0;
        //int endingRow=ar.length-1;
        int startingCol=0;
        //int endingCol=ar[0].length;
        
        for (int i = 0; i < row; i++)
        {
            startingCol=0;

            for (int j = 0; j < col; j++)
            {
                if(ar[i][j]!=0)
                {
                    makeOne(temp,i,j,startingRow,startingCol);
                }

                startingCol++;
            }

            startingRow++;
        }
        return temp;
    }

    public static void main(String[] args)
    {
        // int ar[][]={
        //     {1,0,0},
        //     {0,1,0},
        //     {0,0,0},
        //     };

        // int ar[][]={
        //     {1,0,0,1},
        //     {0,0,1,0},
        //     {0,0,0,0},
        //     };

        // int ar[][]={
        //     {0,0,0},
        //     {0,0,1},
        //     };

        // int ar[][]={
        //     {1,0},
        //     {0,0},
        //     };

        int ar[][]={
            {0},
            {1},
            };
        
        int temp[][]=new int[ar.length][ar[0].length];
        
        temp=booleanM(ar);

        for (int i = 0; i < temp.length; i++) {

            for (int j = 0; j < temp[0].length; j++) {
                
                System.out.print(temp[i][j]+" ");
            }

            System.out.println();
        }

        
    }    
}
