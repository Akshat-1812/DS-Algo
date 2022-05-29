//String -- check string is rotated by 2 in any diretion.

class CheckRotation
{
	static boolean check(String s1,String s2)
	{
		int n=s1.length();
		int m=s2.length();
		
		if(n!=m)
			return false;
		
		if(s1.equals(s2)) //s1=bd
			if(n<2||m<2)  //s2=bd
				return true;
		
		if(n<2||m<2) //s1=a 
		return false;//s2=a
		
		
		for(int i=0;i<1;i++)
		{
			if(s1.charAt(i)==s2.charAt(n-2)&&s1.charAt(i+1)==s2.charAt(n-1))
				return true;
			
			if(s1.charAt(n-2)==s2.charAt(i)&&s1.charAt(n-1)==s2.charAt(i+1))
				return true;
			
		}
		
		return false;
	}	
	public static void main(String...args)
	{
		//String s1="jhiueinfknrgyifrigoniniyiigofgfmhifereuiwo";
		//String s2="ueinfknrgyifrigoniniyiigofgfmhifereuiwojhi";
		
		String s1="rellnmpapqfwkhop";
		String s2="llnmpapqfwkhopre";
		
		boolean bs =check(s1,s2);
		
		if(bs)
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
	}	
}