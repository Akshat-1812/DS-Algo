// String-- remove common char from a string

import java.util.*;

class CommonChar
{
    static final int CHAR=256;

	static String unique(String s1,String s2)
	{
		String s3=s1+s2;
		int count[]=new int[CHAR];
        String res="";

		Arrays.fill(count,0);

		for(int i=0;i<s3.length();i++)
		{
			count[s3.charAt(i)]++;
		}

        for(int i=0;i<s3.length();i++)
        {
            if(count[s3.charAt(i)]==1)
                res+=s3.charAt(i); 
        }

		return res;
	}	
	public static void main(String...args)
	{
		
		String s1="aacdb";
		String s2="gafd";
		
		String res=unique(s1,s2);

		if(res.equals(""))
			System.out.println("-1");
		else
			System.out.println(res);

	}	
}