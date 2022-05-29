//Array--> remove duplicates from sorted array

class RemoveDuplicates //return 2nd max no.
{	
	static int duplicate(int arr[])
	{
		int res=1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[res-1]!=arr[i])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}
	
	public static void main(String...args)
	{
		int  arr[]={10,20,20,20,30,40,40,40,50,80,90,90};
		int res=duplicate(arr);
		
		for(int i=0;i<res;i++)
		System.out.print(arr[i]+" "); 
	}	
}