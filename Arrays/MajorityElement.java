// Array -- Majority element Moore voting algo
/*
1] assume 1st element is majority so count is init. with 1
2] if adjosent element is same count++;
3] else count-- and res=i;
4] check arr[res] is majority or not
*/


class MajorityElement
{	
	static int majority(int arr[],int n) //normal kadens algo
	{
		int me=0,count=1;
		
		for(int i=1;i<n;i++)
		{
			if(arr[me]==arr[i])
				count++;
			else
			{
				me=i;
				count--;
			}
		}
		
		count=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[me]==arr[i])
				count++;
			
			if(n/2>=count)
				return -1;
		}
		
		return me;
	}
	
	
	public static void main(String...ar)
	{
		//int arr[]={8,-4,3,-5,4};
		int arr[]={5,5,5,-8,5,4};
		int n=arr.length;
		
		int x=majority(arr,n);
		
		System.out.println(x);
	}
}