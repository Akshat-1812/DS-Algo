// String

class KeypadTyping
{
	static String printNumber(String s)
	{
		int keypad[]={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,9};
		String res="";
		
		for(int i=0;i<s.length();i++)
		{
			res+=keypad[s.charAt(i)-'a'];
		}
		
		return res;
	}	
	public static void main(String...args)
	{
		
		String s="abdeo";
		
		String res =printNumber(s);
		
		System.out.println(res);
		
	}	
}