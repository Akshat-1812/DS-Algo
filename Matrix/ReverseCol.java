package Matrix;

public class ReverseCol
{   
    // static void swap(int ar[][],int i,int low,int high)
    // {
    //     int temp = ar[low][i];
    //     ar[low][i] = ar[low][high];
    //     ar[low][high] = temp;
    // }
    
    //Function to reverse the columns of a matrix.
    static void reverse(int arr[][])
    {
        int row=arr.length;
        int col=arr[0].length;
        // int count=0;
        int high=col-1;
        
        for(int i=0;i<col-2;i++)
        {
            int low=0;
            
            while(low<row)
            {
                //System.out.println("swap "+arr[low][i]+"<-->"+arr[low][high]);
                // swap(arr,i,low,high);
                int temp = arr[low][i];
                arr[low][i] = arr[low][high];
                arr[low][high] = temp;
                // count++;
                low++;
            }
            high--;
            
        }  

        // for (int i = 0; i < row; i++) this code also works
        // {
        //     {
        //         int high=col-1;
        //         int low=0;
                
        //         while(low<=high)
        //         {
        //             //swap(arr,i,low,high);
                        // int temp = ar[i][low];
                        // ar[i][low] = ar[i][high];
                        // ar[i][high] = temp;

        //             low++;
        //             high--;
        //         }
                
        //     }   
        // }

    }
 
    public static void main(String[] args)
    {
        // n1 = 4, m1 = 3
        int ar[][] = {{ 1,  2,  3, 10, 20,100},
                      { 5,  6,  7, 30 ,40,200},
                      {11, 10,  9, 50, 60,300},
                      {13, 14, 15, 70, 80,400}};
        
        reverse(ar);

        for (int i = 0; i < ar.length; i++) {
            
            for (int j = 0; j < ar[0].length; j++) {
                
                System.out.print(ar[i][j]+" ");
            }

            System.out.println();
        }
    }
}
