//Array --> Max difference problem
//find max of a[j]-a[i] such that index j>i

class MaxElementDiff
{
	static int diff(int arr[])
	{
		int res=arr[1]-arr[0];
		int minval=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			res=Math.max(res,arr[i]-minval);
			minval=Math.min(minval,arr[i]);
		}
		
		return res;
	}
	
	public static void main(String...args)
	{
		int  arr[]={30,10,8,2};
		
		int res=diff(arr);
		
		System.out.print(res+" "); 
	}	
}