package Recursion;
import static java.lang.System.*;

public class StringReverse
{
    public static void reverse(String str)
    {
        //out.println("----------> "+str); to see how it works

        if ((str==null)||(str.length() <= 1))
        {
            out.println(str);
        }
        else
        {
            out.print(str.charAt(str.length()-1));

            reverse(str.substring(0,str.length()-1));
        }
    
    }

    public static void main(String[] args)
    {
        String s1="abcd";

        //char[] ch=s1.toCharArray();

        reverse(s1);

       

    }

}
