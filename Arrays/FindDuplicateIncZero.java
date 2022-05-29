//Array --> Find duplicates in an array.
// Note --> there is only one element is duplicate.
// Note --> N distinct element present and n+1 duplicates is present.
// Note --> one element can be duplicate n times.

// We use Floyed's algo.[ "GFG" searching topic --lect 16 ]
//phase 1] two variables slow and fast. slow moves 1 ndex at a time fast move 2 index.
//phase 2] when they collid bote move 1 index a time

class FindDuplicateIncZero //correct for all elements including zero.
{
	static int duplicate(int arr[])
	{
		int slow=arr[0]+1; //to eleminate zero we add 1 to all elements
		int fast=arr[0]+1;
		
		do
		{
			slow = arr[slow]+1;
			fast = arr[arr[fast]+1]+1;
			
		}while(slow!=fast);
		
		slow=arr[0]+1;
		
		while(slow!=fast)
		{
			slow=arr[slow]+1;
			fast=arr[fast]+1;
		}
		
		return slow-1;
	}
	
	public static void main(String...args)
	{
		int  arr[]={0,2,1,3,5,4,6,2};
		
		int res =duplicate(arr);
		
		System.out.println("Duplicate element is : "+ res); 
	}
}
