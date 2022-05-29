/*
here we need to return the index of first occurance of a no. in sorted array contains duplicates

I/P: {1,2,3,3,3,5}

O/P: 4(index of 3)

*/

class LastOccurance
{
    public static int latOcc(int arr[],int k)
    {
        int low=0;
        int high=arr.length-1;
        int res=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]==k)
            {
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]>k)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return res;
    }

   public static void main(String[] args)
   {
       int arr[]={1,2,3,3,4,4,4,6};
    //    int arr[]={1,1,1,1,1,0,0,0};

       int res=latOcc(arr,10);

       System.out.println("res "+res);

   }     
   
}