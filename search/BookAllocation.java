/*
we have given an array of books containing no. of pages we have to
allocate the books to each student such that maximum no. of pages assigned to a student is minimum.

I/P: ar[]={10,20,30,40},student(m)=2
O/P: 60

Note -->See DSA Notes 2nd copy binary search advance questions

*/


class BookAllocation
{
    public static boolean isPossible(int ar[],int m,int mid)    
    {
        int student_count=1;
        int pagesum=0;

        for(int i=0;i<ar.length;i++)
        {
            if(pagesum+ar[i]<=mid)
            {
                pagesum+=ar[i];
            }
            else
            {
                student_count++;

                if(student_count>m || ar[i]>mid)
                {
                    return false;
                }

                pagesum=ar[i];
            }
        }
       
        return true;
    }

    public static int allocateBooks(int arr[],int m)
    {
        int low=0;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }

        int high=sum;
        int res=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(isPossible(arr,m,mid))
            {
                res=mid;
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
        // int arr[]={10,20,30,40};
        // int m=2; o/p 60;
        
        // int arr[]={12,34,67,90};
        // int m=2;
        
        int arr[]={5,17,100,11};
        int m=4;
        
        int res=allocateBooks(arr,m);
        System.out.println("Ans is "+res);
    }
}