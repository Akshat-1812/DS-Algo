// Array -- Find max and min

class MaxMin
{
	static void maxMin(int arr[])
	{
		int max=0,min=0;
		
		if(arr[0]>arr[1])
			max=arr[0];
		else
			max=arr[1];
		
		if(arr[0]<arr[1])
			min=arr[0];
		else
			min=arr[1];
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("max="+max+"\n"+"min="+min);
	}
	
	
	public static void main(String...ar)
	{
		int arr[]={2,1,6,5,0,78,9};
		maxMin(arr);
		
		
	}
}
