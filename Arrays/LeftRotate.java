//Array--> Left rotate an element by a no. d
//We use reversal algo
/*
	1] Rotate 1st d element.
	2] Rotate remaning element.
	3] Rotate entire array.
*/

class LeftRotate //Anti-clockwise
{
	static void leftRotate(int arr[],int n,int d)
	{
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	
	static void reverse(int arr[],int l, int h)
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
	
	public static void main(String...ar)
	{
		//int arr[]={1,2,3,4,5};
		int arr[]={9,8,7,6,4,2,1,3};
		int n=arr.length;
		int d=2;
		leftRotate(arr,n,d);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
