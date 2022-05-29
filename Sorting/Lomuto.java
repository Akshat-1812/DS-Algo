package Sorting;

class Lomuto
{
    static int iPartition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        } 

        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        
        return i+1;
    }
    
    static void qsort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int p=iPartition(arr,low,high);

            qsort(arr,low,p-1);
            qsort(arr,p+1,high);

        }
    }
    
     public static void main (String[] args) 
    {
        // int arr[] = new int[]{10,80,30,90,40,50,70};
        // int arr[] = new int[]{8,4,7,9,3,10,5};
        // int arr[]={7,2,1,30,10,9,8};
        int arr[]=new int[]{3,5,2,10,1,4,25,6};

        int n = arr.length;
        qsort(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
}