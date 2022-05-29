//String -- Naive pattern search

class Search
{
	static boolean search(String txt,String pat)
	{
		int count=0;
		
		for(int i=0;i<txt.length();i++)
		{
			if(txt.charAt(i)==pat.charAt(count))
			{
				count++;
				
				if(count==pat.length())
				{
					return true;
				}
			}
			else
			{
				count=0;
			}				
		}
		return false;
	}	
	public static void main(String...args)
	{
		String s1="aabaacaadaabaaabaa";
		String s2="ccda";
		
		boolean bs =search(s1,s2);
		
		if(bs)
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
	}	
}