/**
 * You are given string str. You need to remove the pair of duplicates.
Note: The pair should be of adjacent elements and after removing a pair the remaining string is joined together. 

Example 1:

Input:
aaabbaaccd

Output: 
ad

Explanation: 
Remove (aa)abbaaccd =>abbaaccd
Remove a(bb)aaccd => aaaccd
Remove (aa)accd => accd
Remove a(cc)d => ad

Example 2:

Input: 
aaaa

Output: 
Empty String

Explanation: 
Remove (aa)aa => aa
Again removing pair of duplicates then (aa) 
will be removed and we will get 'Empty String'.
 */
import java.util.Stack;

public class RemoveConsecutive2 
{

    public static String removePair(String str)
    {
        
        if(str.length()==1 )
        {
            String a ="";
            a+= str.charAt(0);
            return a;
        }
        
        Stack<Character> ast = new Stack<>();
        String res="";
        
        ast.push(str.charAt(str.length()-1));
        
        for(int i=str.length()-2;i>=0;i--)
        {
            if(!ast.isEmpty() && str.charAt(i)==ast.peek() )
            {
                ast.pop();
            }
            else
            {
                ast.push(str.charAt(i));
            }
        }
        
        while(!ast.isEmpty())
        {
            res+=ast.pop();
        }
        
        return res;
    }

    public static void main(String[] args) 
    {
        String s1 = "aaabbaaccd";

        String res = removePair(s1);

        System.out.println("OUTPUT : "+res);

    }    
}
