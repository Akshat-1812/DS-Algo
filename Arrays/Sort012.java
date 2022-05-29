//Array --> Sort array of 0,1,2
//we use 3 pointer approach

class Sort012
{
	static void sort(int arr[],int n)
	{
		int low=0, temp=0;
		int mid=0,high=arr.length-1;
		
		while(mid<=high)
		{						//{0,2,1,2,0}
				if(arr[mid]==0)	//{0,1,1,0,1,2,1,2,0,0,0,1}
				{
					temp=arr[low];
					arr[low]=arr[mid];
					arr[mid]=temp;
				System.out.println("swapp"+arr[mid]+" & " +arr[low]+"low");	
					
					low++;
					mid++;
				}
				
				if(arr[mid]==1)
				{
					System.out.println("mid="+arr[mid]+" mid++ ");
					mid++;
				}
				
				if(arr[mid]==2)
				{
					temp=arr[mid];
					arr[mid]=arr[high];
					arr[high]=temp;
					high--;
				System.out.println("swapp"+arr[mid]+" & " +arr[high]+"high");	
				}

				//System.out.println(arr[i]+"  ");	
		}
		
	}

	public static void main(String...ar)
	{
		//int arr[]={0,2,1,2,0};
		int arr[]={0,1,1,0,1,2,1,2,0,0,0,1};
		int n=arr.length;
		sort(arr,n);
		
		for(int i=0;i<n;i++)
		 System.out.print(arr[i]+"\t");
	}
}