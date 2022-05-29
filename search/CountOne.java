/**
 * Given a binary sorted non-increasing array of 1s and 0s. You need to print the count of 1s in the binary array.
 */

public class CountOne
{
    public static int latOcc(int arr[],int k)
    {
        int low=0;
        int high=arr.length-1;
        int res=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]==k &&arr[mid+1]==0)
            {
                return mid;
            }
            else if(arr[mid]==0)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
                res=mid;
            }
        }

        return res;
    }
    
    public static int countOnes(int arr[], int N)
    {
        if(arr[0]==0||arr.length==0)
        {
            return 0;
        }
        else if(arr.length==1&&arr[0]==1)
        {
            return 1;
        }
        
        int l=latOcc(arr,N);
        
        return (l+1);
        
    }

    public static void main(String[] args)
    {
        int ar[]={1,1,1,1,1,0,0,0};

        int res=countOnes(ar,ar.length);

        System.out.println(res);
    }
}
