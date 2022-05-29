// count max sum subarray withsize k
/*
int ar[]={5,6,2,1,8,9,7};
int k=3;

ans = 24 // we need to find contenious subarray sum with size k 8+9+7
*/

public class Animal
{
    public static void main(String...args)
    {
        // int ar[]={6,7,8,5,2,3};
        int ar[]={5,6,2,1,8,9,7};
        int k=3;
        int max=0;
        int sum=0;
        
        for(int i=0;i<ar.length;i++)
        {
            //int a=i;
            
            if(ar.length<k+i)
                break;
            
            for(int j=i;j<k+i;j++)
            {
                sum+=ar[j];
                //a++;
            }
            
            max=Math.max(sum,max);
            sum=0;
        }
        
        System.out.println(max);
     
    }
}