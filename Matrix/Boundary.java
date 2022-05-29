package Matrix;

class Boundary
{
    static void bTraverse(int arr[][])
    {
        int r=arr.length; //row
        int c=arr[0].length;

        if(r==1)
        {
            for (int i = 0; i < c; i++)
                System.out.print(arr[0][i]+" ");
        }
        else if (c==1)
        {
            for (int i = 0; i < r; i++)
                System.out.print(arr[i][0]+" ");
        }
        else
        {
            for (int i = 0; i < c; i++)  //1st row
                System.out.print(arr[0][i]+" ");
            
            for (int i = 1; i < r; i++) //last col
                System.out.print(arr[i][c-1]+" ");

            for (int i = c-2; i >=0; i--) //last row
                System.out.print(arr[r-1][i]+" ");
            
            for (int i = r-2; i >=1; i--) //last row
                System.out.print(arr[i][0]+" ");

        }

    }

    public static void main(String[] args)
    {
        // int ar[][]={
        //             {1,2,3,4},
        //             {5,6,7,8},
        //             {9,10,11,12},
        //             {13,14,15,16}
        //             };
        int ar[][]={
                    {1,2},
                    {5,17},
                    };

        bTraverse(ar);

    }   
}
