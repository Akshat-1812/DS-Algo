package Matrix;
// find the index of a row how has largest sum

public class RowSum
{
    public static int sum(int ar[][])
    {
        int res=-1;

        for (int i = 0; i < ar.length; i++)
        {
            int sum=0;
            int cur_sum=0;
            
            for (int j = 0; j < ar[i].length; j++)
            {
                cur_sum+=ar[i][j];
            }

            if(sum<cur_sum)
            {
                res=i;
                sum=cur_sum;
            }
            System.out.println("sum of "+i+" row is "+cur_sum);
        }

        return res;
    }

    public static void main(String[] args)
    {
        int ar[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        int res=sum(ar);
        System.out.println("max sum row is "+res);
    }
    
}
