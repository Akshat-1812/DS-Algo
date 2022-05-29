package Recursion;

import java.util.ArrayList;
import java.util.List;


public class Subset
{

    public static void solve(int ar[],List<Integer> op,int i,List<List<Integer>>ans)
    {
        //base case
        if(i>=ar.length)
        {
            ans.add(op); //output ko add kr do
            return;
        }

        //exclude
        solve(ar,new ArrayList(op), i+1, ans);

        //include
        int ele=ar[i];
        op.add(ele);
        solve(ar, new ArrayList(op), i+1, ans);
    }

    public static List<List<Integer>> subset(int ar[])
    {
        // int size=(int) Math.pow(2,ar.length);

        List<List<Integer>> ans =new  ArrayList<>();

        List<Integer> output =new ArrayList<Integer>();
        //int output[]=new int[size];
        int index=0;

        solve(ar,output,index,ans);

        return ans;

    }

    public static void main(String[] args)
    {
        List<List<Integer>> aList =new ArrayList<>();

        int ar[]={1,2,3};

        aList=subset(ar);

        for (int i = 0; i <aList.size() ; i++)
        {
            for (int j = 0; j < aList.get(i).size(); j++)
            {
                System.out.print(aList.get(i).get(j)+" ");
            }   
            
            System.out.println();
        }


    }   
}

