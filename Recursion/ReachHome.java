package Recursion;

import java.util.Scanner;

public class ReachHome
{

    public static void home(int src,int dest)
    {
        System.out.println("Source=> "+src+" Destination=> "+dest);
        
        if(src==dest)
        {
            return;
        }

        home(src+1,dest);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int src=1;
        int dest = sc.nextInt();

        sc.close();

        home(src,dest);

    }   
}
