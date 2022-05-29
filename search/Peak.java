/*
Mountain problem -- we need to find peak ele.

our arry always has
ar[i1]<ar[i2]...<ar[i-1]
ar[i-1]>ar[i]>ar[i+1]

        peak
         /\ 
        /  \
       /    \
*/ 

class Peak
{
    public static int mountain(int ar[])
    {
        int low=0;
        int high=ar.length-1;
        
        while(low<high)
        {
            int mid=low+(high-low)/2;

            if(ar[mid]<ar[mid+1])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        
        return low;
    }

    public static void main(String[] args)
    {
        int ar[]={0,1,4,5,10,3,2,0};
        //int ar[]={0,1,0};
        int res=mountain(ar);

        System.out.println("Tip of mountain is "+res);
        
    }
}