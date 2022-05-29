/**
 * Binary Search in Infinite size array and return index
 */
public class BSearchInfinite
{
    private static int bSearch(int[] ar, int x, int low, int high)
    {
        if(low>high)
        {
            return -1;
        }

        // int mid=low+(high-low)/2;
        int mid=(low+high)/2;

        if(ar[mid]==x)
        {
            return mid;
        }
        else if(ar[mid]>x)
        {
            return bSearch(ar, x, low, mid-1);
        }
        else
        {
            return bSearch(ar, x, mid+1, high);
        }
    }

    private static int search(int[] ar, int x)
    {
        if(ar[0]==x)
        {
            return 0;
        }
        
        int i=1;

        while(ar[i]<x)
        {
            i=i*2;
        }

        if(ar[i]==x)
        {
            return i;
        }
        // System.out.println("low= "+(i/2)+1);
        // System.out.println("high= "+(i-1));

        return bSearch(ar,x,(i/2)+1,i-1);
    }
    
    public static void main(String[] args)
    {
        int[] ar=new int[]{1,10,15,20,40,60,80,100,200,500,1000};
        int x=100;

        int res=search(ar,x);

        System.out.println(res);
        
    }

}