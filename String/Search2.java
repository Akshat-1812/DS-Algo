//String -- Naive pattern search

class Search2
{
	static boolean search(String txt,String pat)
	{
		int n=txt.length();
		int m=pat.length();
		
		for(int i=0;i<=(n-m); )
		{
			int j;
			
			for(j=0;j<m;j++)
			{
				if(pat.charAt(j)!=txt.charAt(i+j))
					break;
			}
			
			if(j==m)
				return true;
			
			if(j==0)
				i++;
			else
				i=(i+j);

			
		}
		return false;
	}	
	public static void main(String...args)
	{
		String s1="aabaacaadaabaaabaa";
		String s2="caad";
		
		boolean bs =search(s1,s2);
		
		if(bs)
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
	}	
}