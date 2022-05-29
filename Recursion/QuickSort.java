package Recursion;

public class QuickSort
{

    public static void swap(int[] ar,int s,int e)
    {
        int temp=ar[s];
        ar[s]=ar[e];
        ar[e]=temp;
    }

    public static int partition(int ar[],int low,int high)
    {
        int pivot = ar[low];
        int count =0; //count element less than pivot
        
        for (int i = low+1; i <=high; i++)
        {
            if(ar[i]<=pivot)
            {
                count++;
            }
        }
        
        int pivotIndex = low+count;
        
        swap(ar,pivotIndex,low);// place pivot at right place

        int i=low,j=high;

        //sort left and right part according to pivote
        // ele<pivote| pivote |pivote<ele
        while(i<pivotIndex && j>pivotIndex) 
        {
            while(ar[i]<=pivot)
            {
                i++;
            }

            while(ar[j]>pivot)
            {
                j--;
            }

            // here left ele greater than pivot & right ele less than pivot
            //in this case swap
            if(i<pivotIndex && j>pivotIndex) 
            {
                int temp1 = ar[i];
                ar[i]=ar[j];
                ar[j]=temp1;

                i++;
                j--;
            }
        } 
        
        return pivotIndex;
    }

    public static void qSort(int ar[],int low,int high)
    {
        //base case 
        if(low>=high)
        {
            return;
        } 

        // find pivot
        int p = partition(ar,low,high);

        //sort left part
        qSort(ar,low,p-1);

        //sort right part
        qSort(ar,p+1,high);
    }

    public static void main(String[] args)
    {
        int ar[]=new int[]{3,5,2,10,10,1,4,25,6};

        qSort(ar,0,ar.length-1);

        for (int i : ar)
        {
            System.out.print(i+" ");    
        }
        
    }    
}
