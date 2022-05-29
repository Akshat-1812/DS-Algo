//Array--> Right rotate an element by a no. d
//We use reversal algo
/*
	1] Rotate last d element.
	2] Rotate remaning element.
	3] Rotate entire array.
*/

class CyclicallyRotate //Clockwise
{	
	static void rightRotate(int arr[],int n,int d)
	{
		cyclic(arr,n-d,n-1);
		cyclic(arr,0,n-d-1);
		cyclic(arr,0,n-1);
	}
	
	static void cyclic(int arr[],int l,int h)
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
		//int d=1;
		int d=2;
	
		rightRotate(arr,n,d);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}