package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation
{
    private static void swap(int[] ar,int i,int j)
    {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    private static void solve(int[] ar,int index,List<List<Integer>> ans)
    {
        //base case
        if(index==ar.length)
        {
            List<Integer> op=new ArrayList<Integer>();
            for (int i = 0; i < ar.length; i++)
            {
                op.add(ar[i]);
            }
            
            ans.add(op);
            return;
        }
        
        for(int j=index;j<ar.length;j++)
        {
            //swap
            swap(ar,index,j);
                
            
            //R.C
            solve(ar,index+1,ans);
            
            //backtrack
            swap(ar, index, j);
            
        }
        
    }

    private static List<List<Integer>> subset(int[] ar)
    {
        List<List<Integer>> ans = new ArrayList<>();
        
        // List<Integer> op=new ArrayList<Integer>();

        // for (int i : ar)
        // {
        //     op.add(ar[i]);
        // }
        
        int index=0;
        
        solve(ar,index,ans);
        
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
