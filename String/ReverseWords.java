// i/p "I am aks"
// o/p aks am I

class ReverseWords
{
    static void reverse(char[] str,int low,int high)
    {
        while(low<=high)
        {
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;

            low++;
            high--;
        }
    }

    static void reverseWords(char[] str)
    {
        int start=0;
        
        for(int end=0;end<str.length;end++)
        {
            if(str[end]==' ')
            {
                reverse(str,start,end-1);
                start=end+1;
            }

        }
            reverse(str,start,str.length-1);
            reverse(str,0,str.length-1);
    }

    public static void main(String...args)
    {
        String s1="I am Aks";
        char[] str=s1.toCharArray();
       
        reverseWords(str);

        System.out.println(str);
    }

}