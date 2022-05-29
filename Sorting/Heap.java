package Sorting;

class Heap
{
    static void buildHeap(int arr[],int n)
    {
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }

    static void sort(int arr[],int n)
    {
        buildHeap(arr,n);

        for(int i=n-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);
        }
    }

    static void heapify(int arr[],int n,int i)
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[largest])
        {
            largest=left;
        }
        if(right<n && arr[right]>arr[largest])
        {
            largest=right;
        }

        if(largest!=i)
        {
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            heapify(arr,n,largest);
        }

    }

    public static void main(String...args)
    {
        int arr[]={10,15,50,4,20};
        int n=arr.length;

        sort(arr,n);

        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }


}