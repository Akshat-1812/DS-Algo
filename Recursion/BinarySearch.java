package Recursion;

import static java.lang.System.*;

public class BinarySearch
{

    public static int binarySearch(int ar[],int low,int high,int x)
    {
        if(low>high)//not found
        {
            return -1;
        }

        int mid=low+(high-low)/2;

        if(ar[mid]==x)
        {
            return mid;
        }
        else if(ar[mid]<x)
        {
            return binarySearch(ar, mid+1, high, x);
        }
        else
        {
            return binarySearch(ar, low, mid-1, x);
        }
    }

    public static void main(String[] args)
    {
        int ar[]={1,43,56,78,88,90};
        int x=56;

        int res=binarySearch(ar,0,ar.length-1,x);

        out.println(res);

    }
}
