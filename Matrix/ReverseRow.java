package Matrix;

public class ReverseRow
{
    static void swap(int ar[][],int i,int low,int high)
    {
        //System.out.println("swap "+ar[low][i]+"<-->"+ar[high][i]);
        int temp = ar[low][i];
        ar[low][i] = ar[high][i];
        ar[high][i] = temp;
        
    }
    
    //Function to interchange the rows of a matrix.
    static void reverse(int ar[][])
    {
        int row=ar.length;
        int col=ar[0].length;

        if(row==0 || col==0)
            return;
        
        for(int i=0;i<col;i++)
        {
            int low=0,high=row-1;
            
            while(low<high)
            {
                swap(ar,i,low,high);
                
                low++;
                high--;
            }
        }

    }

    public static void main(String[] args)
    {
        int ar[][] = {{ 1,  2,  3, 10, 20,100},
                      { 5, 6,7, 30 ,40,200},
                      {11, 10,9, 50, 60,300},
                      {13,14, 15, 70, 80,400}};

        reverse(ar);

        for (int i = 0; i < ar.length; i++) {

        for (int j = 0; j < ar[0].length; j++) {
        
        System.out.print(ar[i][j]+" ");
        }

        System.out.println();
        }   
    } 
    
}
