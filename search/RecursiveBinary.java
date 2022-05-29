class RecursiveBinary
{
    static int recurBSearch(int ar[],int x,int low,int high)
    {
        if(low>high)
            return -1;

        int mid=(low+high)/2;

        if(ar[mid]==x)
            return x;
        else if(ar[mid]>x)
            return recurBSearch(ar,x,low,mid-1);
        else
            return recurBSearch(ar,x,mid+1,high);

    
	}

	// Driver Code
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50,50,60,70};
        int x=500;
        int low=0;
        int high=arr.length-1;

        int res=recurBSearch(arr,x,low,high);

        System.out.println(res);

	}
}