/**
 * You are given string str. You need to remove the consecutive duplicates 
 * from the given string using a Stack.
 * 
 * Input: 
aaaaaabaabccccccc

Output: 
ababc

Explanation: 
Removing all consecutive duplicates, 
we have no duplicates consecutively.
 */

import java.util.Stack;

public class RemoveConsecutive 
{
    public static String removeConsecutiveDuplicates(String str)
    {
        Stack<Character> ast = new Stack<>();
        String res="";
        
        ast.push(str.charAt(0));
        res+=str.charAt(0);
        
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)!=ast.peek() )
            {
                res+=str.charAt(i);
                ast.push(str.charAt(i));
            }
        }
    
        return res;
    }

    public static void main(String[] args) 
    {
        String s1 = "aaaaaabaabccccccc";
        //O/P ababc
        System.out.println("ans : "+removeConsecutiveDuplicates(s1));
    }

    
}