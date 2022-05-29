// Array --> Minimum consecutive flips
/*1] if array start and end with 0 flip all 1's
2] if array start and end with 1 flip all 0's
3] if array start with 0 and ends with 1 flip all 0's or 1's
4] if array start with 1 and ends with 0 flip all 0's or 1's
*/

class MinConsecutiveFlips
{
	static void flips(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				if(arr[i]!=arr[0])
				{
					System.out.print("from "+i+"to ");
				}
				else
				{
					System.out.println(i-1);
				}
			}
		}
		
		if(arr[arr.length-1]!=arr[0]) //for cases like 3] & 4]
			System.out.print(arr.length-1);
	}	
	public static void main(String...args)
	{
		//int  arr[]={0,1,1,0,0,0,1,1,1,1,1};
		int  arr[]={1,0,1,1,1,1,0,1,1};
		//int  arr[]={1,1,1,1,1};
		
		flips(arr);
		
	}	
}