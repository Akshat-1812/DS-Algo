// Array -- max consecutive one's in a binary array

class MaxConsecutiveOnes
{
	static int buySale(int arr[])
	{
		int max=0,count=0,idx=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[idx]==0&&arr[i]==1)||(arr[idx]==1&&arr[i]==1))
			{
				count++;
				max=Math.max(count,max);
			}
			else
			{
				idx=i;
				count=0;
			}
		}
		
		return max;
	}
	
	public static void main(String...args)
	{
		//int  arr[]={0,1,1,0,0,0,1,1,1,1,1};
		int  arr[]={1,0,1,1,1,1,0,1,1};
		//int  arr[]={1,1,1,1,1};
		
		int res=buySale(arr);
		
		System.out.print(res+" "); 
	}	
}