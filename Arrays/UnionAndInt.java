//Array--> print union And Intersection of an array 
//and count of element present in union & inter.
//---------------------------------------------------------------//
	// only for sorted array //'''
	
class UnionAndInt
{
	static void unionAndInter(int arr1[],int n,int arr2[],int m)
	{
		int i=0,j=0;
		int count=0;
		
		while(i<n&&j<m)
		{
			if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i]+" ");
				count++;
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				System.out.print(arr2[j]+" ");
				count++;
				j++;
			}
			else
			{
				System.out.print(arr2[j]+" ");
				j++;
				i++;
				count++;
			}
		}
	
		while(i<n)
		{
			System.out.print(arr1[i]+" ");
			i++;
			count++;
		}
		
		while(j<m)
		{
			System.out.print(arr2[j]+" ");
			j++;
			count++;
		}
		
			System.out.println("\n"+count);
		
	}
	
	public static void main(String...ar)
	{
		int arr1[]={1,2,3,4,5};
		int arr2[]={1,2,3};
		
		int n=arr1.length;
		int m=arr2.length;
		
		unionAndInter(arr1,n,arr2,m);
		
		//for(int i=0;i<n;i++)
			//System.out.print(arr[i]+" ");
	}
}
