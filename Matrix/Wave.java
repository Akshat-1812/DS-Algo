package Matrix;

//print matrix element in wave or  zig-zag order

public class Wave
{

    public static void wave(int ar[][])
    {
       for (int i = 0; i < ar.length; i++)
       {
            if(i%2==0)
            {
                for (int j = 0; j < ar[0].length; j++)
                {
                    System.out.println(ar[j][i]);
                }
            }
            else
            {
                for (int j = ar.length-1; j>=0 ; j--)
                {
                    System.out.println(ar[j][i]);                    
                }
            }   
       }
    }

    public static void main(String[] args)
    {
        int ar[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };   

        wave(ar);
    }
}
