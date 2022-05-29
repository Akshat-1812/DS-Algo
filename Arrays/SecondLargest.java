// print the index of 2nd larges ele.
import java.util.Scanner;

class SecondLargest
{
    static int sLarge(int ar[])
    {
        int largest=0;
        int res=-1;

        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>ar[largest])
            {
                res=largest;
                largest=i;
            }
            else if(ar[i]!=ar[largest])
            {
                if(res==-1||ar[i]>ar[res])
                {
                    res=i;
                }
            }
        }

        return res;
    }

    public static void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }

        sc.close();
        int res=sLarge(ar);

        System.out.println(res);
    }
}