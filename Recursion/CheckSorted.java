package Recursion;

public class CheckSorted
{

    public static boolean isSorted(int ar[],int n)
    {
        if(n==0||n==1)
        {
            return true;
        }
            
        if(ar[n-2]>ar[n-1])
        {
            return false;
        }
        else
        {
            boolean res=isSorted(ar, n-1);
            return res;
        }
    }

    public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5,6,7,8,9,10,11,21,55,65};

        boolean res = isSorted(ar,ar.length);

        System.out.println(res);

    }   
}
