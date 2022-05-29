//Array -- Longest even odd sub array

class MaxEvenOddSub 
{	
	static int evenOdd(int arr[])
	{
		int res=1,cur=1;
		
		for(int i=1;i<arr.length;i++)
		{
			
			if(((arr[i-1]%2!=0)&&(arr[i]%2==0))||((arr[i-1]%2==0)&&(arr[i]%2!=0)))
			{
				cur++;
				res=Math.max(res,cur);
			}
			else
				cur=1;
		}
		
		return res;
		
	}
	
	public static void main(String...ar)
	{
		int arr[]={5,10,20,6,3,8};
				  
		int res=evenOdd(arr);
		
		System.out.println(res+" ");
	}
}			