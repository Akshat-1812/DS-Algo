//Array--> -ve movr left

class MoveNegLeft
{
	static void moveleft(int arr[],int n)
	{	
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				if(i!=j)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				j++;
			}
		}
		
	}
	
	public static void main(String...ar)
	{
		int arr[]={-1,2,5,-4,0,78,-9,8,-24,-7,-6};
		int n=arr.length;
		moveleft(arr,n);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}
