/*
Find pivote in sorted and roated array

{1,3,8,10,17} //sorted

I/P: {8,10,17,1,3} and roated
o/p: 1(return pivot element) 
*/

class Pivot
{
    public static int findPivot(int arr[])
    {
        int low=0;
        int high=arr.length-1;

        while(low<high)
        {
            int mid=low+(high-low)/2;
            
            if(arr[mid]>=arr[0])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }

        return high; //we can return low also.
        
    }

    public static void main(String[] args)
    {
        //int arr[]={7,9,1,2,3,4};
        //int arr[]={3,8,10,17,1};
        int arr[]={3,4,5,1,2};
    //    int arr[]={6, 11, 24, 37, 42}; //--wrong

        int res=findPivot(arr);

        System.out.println("Pivote element is "+ arr[res]);
        System.out.println("Pivote index is "+ res);
    }

}