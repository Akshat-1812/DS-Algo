package Matrix;

/**
 * ------------------- BINARY SEARCH IN 2D ARRAY ------------
 * our row is sorted
 * first integer of each row is greater than last integer of prevoius row
 * 
 * To convert 2d array into 1 day is (row*col)-1
 *  ---         ---
 *  | 1  3  5  7  |
 *  | 10 11 16 20 | 
 *  | 23 30 34 60 |
 *  ---         ---
 * 
 * low=0                                         high=11
 * [1 , 3 , 5 , 7, 10, 11, 16, 20, 23, 30, 34, 60]
 *  
 * row*col-1 give last index of this linear array
 * 
 * if we divide any index of linear array with col then we get in which row in our 2D array our element belong
 * 
 *  (linear_array_index)/col_size
 * 
 * index of 16 is 6
 * 6/4=1 [it means 16 is present in 1st row]
 * 
 * for column location in 2d matrix
 *
 * (linear_array_index)%col_size 
 */
//Time O(log(mn))
public class Search2D
{
    public static boolean search(int ar[][],int x)
    {
        int col=ar[0].length;
        int low=0;
        int high=(ar.length*ar[0].length)-1;

        if(ar[0][0]>x)
        {
            return false;
        }
        

        while (low<=high)
        {
            int mid = low + (high-low)/2;
            
            int element = ar[mid/col][mid%col]; 

            if(element==x)
            {
                return true;
            }
            else if(element<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }

        return false;
    }


    public static void main(String[] args)
    {
        int ar[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60},
            };
        int x=0;
        
        boolean res=search(ar,x);

        if(res)
            System.out.println("element found ");
        else
            System.out.println("element Not found ");
    }
}
