package Recursion;
import static java.lang.System.*;


public class palindrom
{

    public static boolean isCheck(String s1,int i)
    {
        //base condition
        if(i>s1.length()-i-1)
        {
            return true;
        }

        if(s1.charAt(i) != s1.charAt(s1.length()-i-1))
        {
            return false;
        }
        else
        {
            return isCheck(s1, i+1);
        }

    }

    public static void main(String[] args)
    {
        String s1="bookkoob";

        boolean res= isCheck(s1,0);
       
        out.println(res);
    }
}
