// String -- Find Non repeating char

import java.util.*;

class NonRepeat
{
    static final int ran=256;
    //Function to find the first non-repeating character in a string.
    static char unique(String s)
    {
        
        int count[]=new int[ran];
        char res='$';
        
        Arrays.fill(count,0);
        
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        
        //System.out.println(count[1]);
        
        for(int i=0;i<s.length() ;i++)
        {
            if(count[s.charAt(i)]==1)
            {
                res=s.charAt(i);
                break;
            }
        }
        
        return res;
    }

    public static void main(String...args)
	{
		
		String s1="hello";
		char res=unique(s1);

		// if(res.equals("$"))
		// 	System.out.println("-1");
		// else
			System.out.println(res);

	}	

}
