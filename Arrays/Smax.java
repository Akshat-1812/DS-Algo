// Array --> Max and second max
/* Suppose form a0,a1...ai-1..ai
   we find our max and second max element now we only have to check with ai.
   we have 3 cases-->
1] if(a[i]>a[max]): sec_max=max , max=if..........if we want to return index
2] if(a[i]==a[max]): Ignore
3] if(a[i]<a[max]): 3 sub cases
*/

// Note --> in order to return both max and sec max use arrylist

class Smax //return 2nd max no.
{	
	static int secMax(int arr[])
	{
		int max=arr[0],smax=-1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]!=max)
			{
				if(smax==-1||arr[i]>smax)
				{
					smax=arr[i];
				}
			}
			
		}
		
		return smax;
	}
	
	public static void main(String...args)
	{
		int  arr[]={1,2,3,4,5,6,7,8,9,10};
		int res=secMax(arr);
		
		System.out.print(res); 
	}
	
}
