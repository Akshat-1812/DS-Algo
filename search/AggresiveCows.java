import java.util.*;
// this code is modified by me so that we prevent the use of sort() function
//insted i use a counter.
// see DSA 2nd copy binary search advance question section.

class AggresiveCows
{

    public static boolean isPossible(int ar[],int k,int mid/*,int count*/)
    {
        int cow_count=1;
        // int lastpos=ar[count];
        int lastpos=ar[0];

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]-lastpos>=mid)
            {
                cow_count++;

                if(cow_count==k)
                    return true;

                lastpos=ar[i];
            }
        }
        return false;
    }

    public static int cow(int ar[],int k)
    {
         Arrays.sort(ar);

        int low=0;
        int maxi=-1;

        for(int i=0;i<ar.length;i++)
        {
            maxi=Math.max(maxi,ar[i]);
        }
        // int count=0;
        int high=maxi;
        int res=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            // count++;
            if(isPossible(ar,k,mid))
            {
                res=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        
        return res;
    }

    public static void main(String[] args)
    {
        // int ar[]={4,2,1,3,6};
        // int k=2;
        
        int ar[]={1,2,3};
        int k=2;
        int res=cow(ar,k);

        System.out.println("largest distance is "+res);
        
    }
}