package Recursion;

/**
 * ip n=99
 * op=9 [9+9=18=>1+8=>9]
 */

public class DigitalRoot
{
    public static int sum_of_digit(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        
        sum=sum+n%10;
        n=n/10;
        
        return sum_of_digit(n, sum);
        
    }

    public static int digitalRoot(int n)
    {
        if(n <10 && n>=0)
        {
            return n;
        }
        
        n=sum_of_digit(n,0);
        //System.out.println(n);
        return digitalRoot(n);
    }

    public static void main(String[] args)
    {
        int num=10514;
        
        int result = digitalRoot(num);
        System.out.println("Sum of digits in " +num + " is " + result);

    }
}
