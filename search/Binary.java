class Binary
{
    static int bSearch(int ar[],int x)
	{
        int low=0,high=ar.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(ar[mid]==x)
                return x;
            else if(x<ar[mid])
                high=mid-1;
            else
                low=mid+1;
            
        }

        return -1;

	}

	// Driver Code
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50,50,60,70};
        int x=50;

        int res=bSearch(arr,x);

        System.out.println(res);

	}
}