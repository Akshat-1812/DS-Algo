// String -- Reverse the sentence without reversing individual words.

class ReverseS
{
    static final int ran=256;
    
    static String unique(String s)
    {
        String[] s2=s.split("\\.");
        String res="";
        
       //System.out.println(s2[1]);

        for(int i=s2.length-1;i>=0;i--)
        {
            if(i==0)
                res+=(s2[i]);
            else
                res+=(s2[i]+'.');
            
        }
        
        
        return res;
    }

    public static void main(String...args)
	{
		
		String s1="I.am.Aks";
		String res=unique(s1);

		System.out.println(res);

	}	

}
