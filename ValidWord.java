public class ValidWord
{
    static boolean isvalid(char[] c,int s,int e)
    {
        
        while(s<=e)
        {
            if( (c[s]>=97&&c[s]<=122)||(c[s]>=65 && c[s]<=90)||
            c[s]=='.'||c[s]=='?'||c[s]==','||c[s]=='!'||c[s]=='-')
            {
                
            }
            else
            {
                return false;
            }
            s++;
        }
        return true;
    }
    
    static int countW(char[] s)
    {
      
      int start=0;
      int cnt=0;
      boolean f=false;
            
      for(int end=0;end<s.length;end++)
      {
          if(s[end]==' ')
          {
              f=isvalid(s,start,end-1);
              start=end+1;
              if(f)
              {
                  cnt++;
              }
          }
          
      }
        f=isvalid(s,start,s.length-1);
        if(f)
            cnt++;
        
        return cnt;
    }
    
    public static void main(String args[])
    {
       //String s1=" jds ai, 12 ab[d ak-i a";
    String s1="he is a good programmer, he won 865";// cpmpetition, but sometimes he dont. what do you think? All test-case should pass. Done-done?";
      char[] ch=s1.toCharArray();
      
      int res=countW(ch);
      
      System.out.println(res);
      
      
      
    }
}