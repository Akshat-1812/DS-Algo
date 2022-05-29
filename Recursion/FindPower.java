package Recursion;

public class FindPower
{

    public static long power(long a,long b)
    {
        //base case
        if(b==0)
        {
            return 1;
        }
        if(b==1)
        {
            return a;
        }

        long ans =(long) power(a, b/2);

        if(b%2==0)
        {
            return (long)ans * ans;
        }
        else
        {
            return (long)a*ans*ans;
        }

    }

    public static void main(String[] args)
    {
        long a=2;
        long b=55;
        
        long res = power(a,b);

        System.out.println(res);

    }   
}
