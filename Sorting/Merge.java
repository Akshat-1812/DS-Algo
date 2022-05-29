package Sorting;

class Merge
{
    static void merge(int arr[],int low,int mid,int high)
    {

        int n1=mid-low+1; //size of left array
        int n2=high-mid;//size of right array
        
        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++)
        {
            left[i]=arr[low+i];
        }
            
        for(int j=0;j<n2;j++)
        {
            right[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=low;

        //merge 2sorted array
        while(i<n1 && j<n2) 
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=right[j];
                j++;
                k++;
            }
        }

        while(i<n1) //store remaning element
        {
            arr[k]=left[i];
            k++;
            i++;
        }
            
        while(j<n2) //store remaning element
        {
            arr[k]=right[j];
            k++;
            j++;
        }

    }

    static void mergeSort(int ar[],int l,int h)
    {
        if(h>l)
        {
            int m=l+(h-l)/2;
            // int m=(l+h)/2;

            mergeSort(ar,l,m);
            mergeSort(ar,m+1,h);
            merge(ar,l,m,h);
        }
    }

    public static void main(String...args)
    {
        int ar[]={5,20,40,10,60,10,30};
        int low=0,high=6;

        // merge(ar,low,mid,high);
        mergeSort(ar,low,high);

        for(int x:ar)
            System.out.print(x +" ");

    }

}