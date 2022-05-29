public class CountLetter
{
    public static int reverse(char ch[],int s,int e)
    {
        int count=0;
        for(int i=s;i<e;i++)
            count++;
        return count;
    }
    
    
    public static void main(String...args)
    {
        //String s1="A day out"; // o/p 1 3 3
        String s1="Hello Three";//o/p 5 5
        
        int count=0;
        int s=0;
        
        char ch[]=s1.toCharArray();
       
        for(int e=0;e<ch.length;e++)
        {
            
            if(ch[e]==' ')
            {
                count=reverse(ch,s,e);
                s=e+1;
                System.out.print(count+" ");
            }
        
        }
        
        count=reverse(ch,s,ch.length);
        System.out.print(count);
     
    }
}