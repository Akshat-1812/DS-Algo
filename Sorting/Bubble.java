package Sorting;

class Bubble
{
    static void bsort(int arr[])
    {
        boolean swapped; //=false;

        for(int i=0;i<arr.length-1;i++)
        {
            swapped=false;

            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            
            if(swapped==false)
                break;
        }
    }

    public static void main(String...args)
    {
        int ar[]={5,2,4,1,9,60,0};

        bsort(ar);

        for(int x:ar)
            System.out.print(x+" ");
    }
}