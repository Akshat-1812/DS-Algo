//  int low=0;
//         int high=1;
//         int ans=0;
//         int res=0;
        
//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[low]<arr[high])
//             {
//                 int temp=arr[high]-arr[low];
//                 //ans=Math.max(ans,temp);
//                 ans=ans+temp;
//                 res=ans;
                
//                 low++;
//                 high++;
//             }
//             else
//             {
//                 low++;
//                 high++;
//                 ans=0;
                
//             }
//         }
        
//         return res;

        // int max=0,count=0;
        
        // for(int i=1;i<arr.length;i++)
        // {
        //     if(arr[i-1]<arr[i])
        //     {
        //         count++;
        //         max=Math.max(max,count);
        //     }
        //     else
        //     {
        //         count=0;
        //     }
        // }
        
        // return max;