package Recursion;

import java.util.Scanner;

public class SayWords
{
    public static void say(String[] ar,int n)
    {

        if(n==0)
        {
            return;
        }
        
        int digit=n%10;
        n=n/10;

        say(ar,n);

        System.out.print(ar[digit]+" ");
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        sc.close();

        String[] s1={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        say(s1,num);

    }   
}
