package Sorting;

class Insertion
{
    static void insert(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;

        }

    }

    public static void main(String...args)
    {
         int ar[]={5,20,40,60,10,30};
        //int ar[]={7,2,1,30,10,9,8};

        insert(ar);

        for(int x:ar)
            System.out.print(x +" ");

    }

}