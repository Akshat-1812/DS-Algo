// Array -- Stock buy and sell

class StockBuyAndSale
{
	static int buySale(int arr[])
	{
		int profit=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
			{
				profit+=arr[i]-arr[i-1];
			}
		}
		
		return profit;
	}
	
	public static void main(String...args)
	{
		int  arr[]={1,5,3,2,8,12};
		
		int res=buySale(arr);
		
		System.out.print(res+" "); 
	}	
}