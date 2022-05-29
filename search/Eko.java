//DSA notes wnd copy binary search

//import java.util.Scanner;

class Eko
{

    public static boolean isPossible(int ar[],int m,int mid)
    {
        int sum=0;

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>=mid)
            {
                sum += (ar[i]-mid);
                if(sum>=m)
                {
                    return true;
                }
            }
        }
        
        return false;
    }

    public static int maxHeight(int ar[],int m)
    {
        //Arrays.sort(ar);
        int low=0;
        int maxi=0;
        
        for(int i=0;i<ar.length;i++)
        {
             maxi=Math.max(ar[i],maxi);
            //maxi+=ar[i];
        }
        
        // int high=ar[ar.length-1];
        int high=maxi;
        int res=-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if(isPossible(ar,m,mid))
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
        int ar[]={20,15,10,17};
        int m=7;
        // int ar[]={4,42,40,26,46};
        // int m=20;

        int res=maxHeight(ar,m);

        System.out.println("Maximum height is "+res);
        
    }
}