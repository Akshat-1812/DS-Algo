package Recursion;
import static java.lang.System.*; 

public class LinearSearch
{ 
    public static boolean search(int ar[],int n,int k)
    {
        if(n==0)
        {
            return false;
        }
        
        if(ar[n-1]==k)
        {
            return true;
        }
        else
        {
            boolean res=search(ar, n-1, k);
            return res;
        }



    }

    public static void main(String[] args)
    {
        int ar[]={1,2,5,8,9};
        int x=9;
        
        out.println(search(ar,ar.length,x));

    }
}
