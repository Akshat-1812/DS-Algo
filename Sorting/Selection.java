package Sorting;

class Selection
{
    static void sSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }

    public static void main(String...args)
    {
        int ar[]={5,2,4,1,9,60,0};

        sSort(ar);

        for(int x:ar)
            System.out.print(x+" ");

    }
}