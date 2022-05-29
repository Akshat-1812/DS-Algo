package Recursion;
//we have sorted array and find first occurance using recursion

public class FirstOccurance
{
    public static int first(int ar[],int start,int x)
    {
        //base
        if(start==ar.length)
        {
            return -1;
        }

        if(ar[start]==x)
        {
            return start;
        }
      
        return first(ar, start+1, x);
    }

    public static void main(String[] args)
    {
        int ar[]={1,2,5,5,6,9,20,20,20};

        int x=20;

        int res = first(ar,0,x);

        System.out.println(res);

    }
}
