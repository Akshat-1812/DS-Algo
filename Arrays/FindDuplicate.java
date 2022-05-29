//Array --> Find duplicates in an array.
// Note --> there is only one element is duplicate.
// Note --> N distinct element present and n+1 duplicates is present.
// Note --> one element can be duplicate n times.

// We use Floyed's algo.[ "GFG" searching topic --lect 16 ]
//phase 1] two variables slow and fast. slow moves 1 ndex at a time fast move 2 index.
//phase 2] when they collid bote move 1 index a time

class FindDuplicate //correct for only non-zero elements
{
	static int dublicate(int arr[])
	{
		int slow=arr[0];
		int fast=arr[0];
		
		do
		{
			slow=arr[slow];
			fast=arr[arr[fast]];
		
		}while(slow!=fast);
		
		slow=arr[0];
		
		while(fast!=slow)
		{
			fast=arr[fast];
			slow=arr[slow];
		}
		
		return slow;
	}
	
	public static void main(String...args)
	{
		int  arr[]={1,2,3,4,2};
		
		int res =dublicate(arr);
		
		System.out.println("Duplicate element is : "+ res); 
	}
}
