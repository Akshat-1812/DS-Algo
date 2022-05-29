/*
here we need to return the index of first occurance of a no. in sorted array contains duplicates

I/P: {1,2,3,3,3,5}

O/P: 2(index of 3)

*/
class FirstOccurance
{
    static int firstOcc(int  ar[],int k)
    {
        int low=0;
        int high=ar.length-1;
        int res=-1;
        // int mid=low+(high-low)/2;

        while(low<high)
        {
            int mid=low+(high-low)/2;

            if(ar[mid]==k)
            {
                res=mid;
                high=mid-1;
            }
            else if(ar[mid]>k)
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
        int ar[]={1,2,3,3,3,5}; 
    //    int ar[]={98765, 99300, 99455, 99500, 99555};
            
            
        int res=firstOcc(ar,5);
        System.out.print("Index of first occurance "+ res );       
    }
}