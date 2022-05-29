// Array -- reverse k sub arrays

class ReverseKSubArray //correct for only non-zero elements
{
	static int count=1,start=0;
	
	static void slide(int arr[],int k)
	{
		for(int i=1;i<arr.length;i++)
		{
			count++;
			
			if(count%k==0)
			{
				reverse(arr,start,count-1);
				start=count;
			}
		}
		
		reverse(arr,start,arr.length-1);
	}
	
	static void reverse(int arr[],int l,int h)
	{
		while(l<h)
		{
			int temp=arr[l];
			arr[l]=arr[h];
			arr[h]=temp;
			
			l++;
			h--;
		}
	}

	public static void main(String...args)
	{
		int  arr[]={1,2,3,4,5,6,7,8,9,10};
		int k=4;
		slide(arr,k);
		
		for(int a:arr)
			System.out.print(a+" "); 
	}
}