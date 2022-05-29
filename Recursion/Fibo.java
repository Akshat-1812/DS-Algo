package Recursion;

import java.util.Scanner;

public class Fibo
{
    public static int find(int n)
    {

        if(n==0)
            return 0;
        
        if(n==1)
            return 1;

        return find(n-1)+find(n-2);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int res = find(n);
        sc.close();

        System.out.println(res);
    }
}
