// Array - move all zero element to left

class MoveZeroLeft
{
	static void moveLeft(int arr[])
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				
				count++;
			}
		}
	}
	
	public static void main(String...args)
	{
		int  arr[]={10,0,20,0,30,0,0,40,0,0,90,0};
		
		moveLeft(arr);
		
		for(int i:arr)
		System.out.print(i+" "); 
	}	
}