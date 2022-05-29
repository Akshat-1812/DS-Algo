package Matrix;

//Matrix -- Print matrix in snake pattern

class SnakeTraversal 
{	
	static void traverse(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int j=arr[i].length-1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	
	}
	
	public static void main(String...ar)
	{
		int arr[][]={{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16},
				  };
				  
		traverse(arr);
	}
}	