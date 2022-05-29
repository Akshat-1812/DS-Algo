package Recursion;

public class BubbleSort
{
    public static void rescursiveSort(int ar[],int n)
    {
        //base case
        
        if(n==0||n==1)
            return;

        //processing -- ek element sort kr do 
        for (int i = 0; i < n-1; i++)
        {
            if(ar[i]>ar[i+1])
            {
                int temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }   
        }

    //recursive call -- after ecah call unsorted array size dec. 1
        rescursiveSort(ar, n-1);
        
    }

    public static void main(String[] args)
    {
        int ar[]={5,8,7,4,50,2,10};

        rescursiveSort(ar,ar.length);

        for (int i : ar)
        {
            System.out.print(i+" ");
        }

    }   
}
