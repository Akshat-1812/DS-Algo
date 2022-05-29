/*
we have arr of boards and k painters

Time to paint 1 unit of area of a board is 1 unit 

we have to find minimum time required to paint the entire array

Note--> same as book allocation problem

*/

class Painter
{
    public static boolean isPossible(int ar[],int k,int mid)
    {
        int painter_count=1;
        int boardsum=0;

        for(int i=0;i<ar.length;i++)
        {
            if(boardsum+ar[i]<=mid)
            {
                boardsum += ar[i];
            }
            else
            {
                painter_count++;

                if( painter_count>k || ar[i]>mid )
                {
                    return false;
                }

                boardsum=ar[i];
            }
        }
        
        return true;
    }

    public static int paint(int ar[],int k)
    {
        int low=0;
        int sum=0;

        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }

        int high=sum;
        int res=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(isPossible(ar,k,mid))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }

        return res;
    }

    public static void main(String[] args)
    {
        int ar[]={5,5,5,5};
        int k=2;

        int res=paint(ar,k);

        System.out.println("Minimum time is "+res);
    }
}