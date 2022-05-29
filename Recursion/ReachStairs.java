package Recursion;

import java.util.Scanner;

/**
 * we have give n stairs
 * initially we are at 0th stair
 * we can either 1 step or 2 at a time
 * we need to print all the possible ways to reach nth stair
 * We can optimize it using DP
 */

public class ReachStairs
{
    public static int ways(int n)
    {
        if(n<0)
            return 0;
        
        if(n==0)
            return 1;

        return ways(n-1) + ways(n-2); //to go nth stair by (n-1) or (n-2)
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int stair=sc.nextInt();

        sc.close();

        int res=ways(stair);

        System.out.println(res);

    }   
}
