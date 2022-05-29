package Sorting;
// Not working fine
class Hoare
{
    static int isPartition(int arr[], int l, int h)
    {   
        int pivot=arr[l];
        int i=l-1;
        int j=h+1;
        
        while(true)
        {
            do
            {
                i++;
            }while(arr[i]<pivot);

            do
            {
                j--;
            }while(arr[j]>pivot);

            if(i>=j)
                return j;
            
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    }
    
    public static void qSort(int ar[],int low,int high)
    {
        if(low<high)
        {
            int p=isPartition(ar, low, high);

            isPartition(ar, low, p);
            isPartition(ar, p+1, high);
        }
    }
    
     public static void main (String[] args) 
    {
        int arr[] = new int[]{10,80,30,90,40,50,70};
        
        int n = arr.length;
        qSort(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
}