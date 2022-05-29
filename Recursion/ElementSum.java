package Recursion;

public class ElementSum
{

    // private static void print(int ar[],int n)
    // {
    //     System.out.println("size is "+n);
        
    //     for (int i = 0; i < n; i++) {
            
    //         System.out.print(ar[i]+" ");
    //     }

    // }

    public static int getSum(int ar[],int n)
    {
        // print(ar,n);

        if(n<=0)
        {
            return 0;
        }
        
        int rem= getSum(ar, n-1);

        int sum = ar[n-1]+rem;

        return sum;

    }

    public static void main(String[] args)
    {
        int ar[]={10,20,30,10,50};

        int res=getSum(ar,ar.length);

        System.out.println(res);

    }   
}
