// Array -- Max Circular sum subarray



class MaxCircularSubArray
{	
	static int maxSubArry(int arr[],int n) //normal kadens algo
	{
		int max=0,sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
			max=Math.max(sum,max);
			
			if(sum<0)
				sum=0;
		}
		return max;
	}
	
	static int maxCircularSubArry(int arr[],int n)
	{
		int normalmax=maxSubArry(arr,n);
		
		if(normalmax<0)
			return 0;
		
		int arr_sum=0;
		
		for(int i=0;i<n;i++)
		{
			arr_sum+=arr[i];
			arr[i]=-arr[i];
		}
		
		int circular_sum=arr_sum+maxSubArry(arr,n);
		
		return Math.max(circular_sum,normalmax);
		
	}
	
	
	
	public static void main(String...ar)
	{
		//int arr[]={8,-4,3,-5,4};
		int arr[]={5,-3,-2,6,-1,4};
		int n=arr.length;
		
		int x=maxCircularSubArry(arr,n);
		
		System.out.println(x);
	}
}