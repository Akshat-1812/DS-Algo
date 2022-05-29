package Recursion;

import java.util.ArrayList;

public class SubSequence
{

    public static void solve(String s1,int i,String op,ArrayList<String>ans)
    {
        //base case
        if(i>=s1.length())
        {
            if(op.length()>0)
            {
                ans.add(op);
            }
            return;
        }

        //exclude
        solve(s1, i+1,op, ans);

        //include
        char ele=s1.charAt(i);
        op=op+ele;
        solve(s1, i+1, op, ans);


    }

    public static ArrayList<String> subseq(String s1)
    {
        ArrayList<String> ans = new ArrayList<String>();
        String op = "";
        int index=0;

        solve(s1,index,op,ans);

        return ans;
    }

    public static void main(String[] args)
    {
        ArrayList<String> aList =new ArrayList<String>();

        String s1="abc";

        aList=subseq(s1);

        for (int i = 0; i <aList.size() ; i++)
        {
            System.out.println(aList.get(i));
           
        }   
    }

}
