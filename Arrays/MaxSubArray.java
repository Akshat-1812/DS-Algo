//Array --> Find the contiguous sub-array with max. sum


class MaxSubArray
{	
	static int maxSubArry(int arr[],int n)
	{
		int max=0 ,sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			max=Math.max(max,sum);
			
			if(sum<0)
				sum=0;
			
		}
		
		return max;
	}
	
	
	public static void main(String...ar)
	{
		//int arr[]={-8,4,-3,5,-4};
		int arr[]={1,2,3,-2,-3,-1};
		int n=arr.length;
		
		int x=maxSubArry(arr,n);
		
		System.out.println(x);
	}
}