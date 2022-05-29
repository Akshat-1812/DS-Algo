//import java.util.*; gives error 
import java.util.Stack;

class ReverseSentence
{
    public static String reverse(String s1)
    {
        char rev[] =new char[s1.length()];

        Stack <Character> s=new Stack <Character> ();

        for(int i=0;i<s1.length();i++)
        {
            s.push(s1.charAt(i));
        }

        int i=0;
        while(!s.isEmpty())
        {
            rev[i]=s.pop();
            i++;
        }

        return new String(rev);

    }


    public static void main(String...args)
    {
        //Scanner sc
        String s1= "I am Akshat";

        System.out.println("Reversed sentance "+ reverse(s1));

    }
}
