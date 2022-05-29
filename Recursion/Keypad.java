package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Keypad
{
    private static void solve(String digit,int index,String[] map,StringBuilder op,List<String>ans)
    {
        //base case
        if(index>=digit.length())
        {
            ans.add(op.toString());
            return;
        }

        //find no.
        int no=digit.charAt(index)-'0';
        String value=map[no];

        for (int i = 0; i < value.length(); i++)
        {
            op.append(value.charAt(i));

            solve(digit, index+1, map, op, ans);

            //backtrack
            op.deleteCharAt(op.length()-1);
        }

    }

    public static List<String> keyComb(String digit)
    {
        List<String> ans= new ArrayList<>();
        String[] map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        String output="";
        StringBuilder op=new StringBuilder(output);

        int index=0;

        solve(digit,index,map,op,ans);

        return ans;
    }

    public static void main(String[] args)
    {
        List<String> l1=new ArrayList<>();

        String s1="23";

        l1=keyComb(s1);

        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));   
        }
    }   
}
