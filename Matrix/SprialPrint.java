package Matrix;

public class SprialPrint //or sprial travesal
{
    public static void sprial(int ar[][])
    {
        int total=ar.length*ar[0].length;

        int startingRow=0;
        int startingCol=0;
        int endingRow=ar.length-1;
        int endingCol=ar[0].length-1;

        int count=0;

        while (count<total)
        {
            //starting row
            for (int i = startingCol;(i <= endingCol && count<total); i++)
            {
                System.out.print(ar[startingRow][i]+" ");
                count++;
            }
            startingRow++;

            //ending col
            for (int i = startingRow; (i <= endingRow && count<total) ; i++)
            {
                System.out.print(ar[i][endingCol]+" ");
                count++;
            }
            endingCol--;

            //ending row
            for (int i = endingCol;(i >= startingCol && count<total); i--)
            {
                System.out.print(ar[endingRow][i]+" ");   
                count++;
            }
            endingRow--;

            //starting col
            for (int i = endingRow; (i >= startingRow && count<total); i--)
            { 
                System.out.print(ar[i][startingCol]+" ");
                count++;
            }
            startingCol++;

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

        sprial(ar);   
    }
}
