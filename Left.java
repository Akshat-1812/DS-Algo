import java.util.Scanner;

//remove k smallest no. from right and perform modulo
//incomplete

class Flowers
{
    int flowerId,rating,price;
    String flowerName,type;

    Flowers()
    {
        this.flowerId=0;
        this.rating=0;
        this.price=0;
        this.flowerName=" ";
        this.type=" ";
    }


}

public class Left
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        Flowers f[]=new Flowers[4];

        for (int i = 0; i < f.length; i++)
        {
            Flowers temp=new Flowers();
            
            temp.flowerId=sc.nextInt();
            sc.nextLine();

            temp.flowerName=sc.nextLine();
            // sc.nextLine();

            temp.price=sc.nextInt();
            sc.nextLine();

            temp.rating=sc.nextInt();
            sc.nextLine();

            temp.type=sc.nextLine();

            f[i]=temp;
        }
        
        // sc.nextLine();
        String para = sc.nextLine();

        sc.close();
        Flowers res= findMinPriceByType(f,para);

        if (res!=null)
        {
            System.out.println(res.flowerId);
        }
        else
        {
            System.out.println("There is no flower with given type");
        }
    }

    private static Flowers findMinPriceByType(Flowers[] f, String para)
    {
        int maxi=Integer.MAX_VALUE;
        int op=0;
        int count=-1;

        for (int i = 0; i < f.length; i++)
        {
            if(f[i].rating>3)
            {
                String t=f[i].type;
                t=t.toLowerCase();
                para=para.toLowerCase();

                if(t.equals(para))
                {
                    op=f[i].price;
                    
                    if(maxi>op)
                    {
                        maxi=op;
                        count=i;
                    }
                }
            }

        }
        
        if(count>-1)
        {
            return f[count];
        }

        return null;
    }//method end
}//MyClass End

// int min=arr[0];
//         int minIdx=0;
//         long sum=0L;
       			
//         for (int i = 0; i < k; i++)
//         {
//             for(int j=1;j<arr.length;j++)
//             {
//                 if(arr[j]<min)
//                 {
//                     min=arr[j];
//                     //System.out.println(arr[j]+"---"+arr[min]);
                    
//                     minIdx=j;
//                     // count++;
//                     //System.out.println(minIdx+"---"+arr[minIdx]);
//                 }
                
//             }
//             //if(minIdx!=-1)
//             //{
//                 for (int s = minIdx+1; s < arr.length; s++)
//                 {
//                     arr[s-1]=arr[s];
//                    // System.out.println("new arr "+arr[0]+" ");
//                     // count++;
//                 }
//             //}

//         }

//         for (int i = 0;i < arr.length-k; i++)
//         {   
//             int j=i;
//             long base=1L;
//             long  mod=1000000007L;    
//             //long res=0L;

//             while(j>0)
//             {   
//                 base*=(100000+3);
//                 j--;
//             }

//             sum+=(long)((long)(arr[i]*base)%mod);
        
//             System.out.println("sum--"+(long)sum+" ");
//             // System.out.println("sum-->"+(long)res+" ");
//         }
        
//     }

//     public static void main(String[] args)
//     {
//         // int ar[]={5,1,3,4};//2699770
//         int ar[]={1,2};
//         int k=0;
        
//          minO(ar,k);

//         //System.out.println(res);
