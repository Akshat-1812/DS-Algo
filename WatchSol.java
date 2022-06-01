import java.util.*;

// class Watch
// {
//     private int watchId;
//     private String watchName;
//     private double price;
//     private String brand;

//     Watch(int watchId,String watchName,double price,String brand)
//     {
//         this.watchId=watchId;
//         this.watchName=watchName;
//         this.price=price;
//         this.brand=brand;
//     }

//     public String getWatchName() {
//         return watchName;
//     }

//     public void setWatchName(String watchName) {
//         this.watchName = watchName;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     public int getWatchId() {
//         return watchId;
//     }

//     public void setWatchId(int watchId) {
//         this.watchId = watchId;
//     }

//     public String getBrand() {
//         return brand;
//     }

//     public void setBrand(String brand) {
//         this.brand = brand;
//     }

    
// }

@SuppressWarnings("WatchSol")
public class WatchSol
{
    @SuppressWarnings("watchId")
    private int watchId;
    private String watchName;
    private double price;
    private String brand;

    WatchSol(int watchId,String watchName,double price,String brand)
    {
        this.watchId=watchId;
        this.watchName=watchName;
        this.price=price;
        this.brand=brand;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        WatchSol[] aobj= new WatchSol[n];
        
        for (int i = 0; i <n; i++)
        {
            aobj[i]=new WatchSol(sc.nextInt(),sc.next(), sc.nextDouble(),sc.next());
        }

        String sb=sc.next();

        sc.close();

        int res=associateTech(aobj,sb);

        if (res>0)
        {
            System.out.print(res);
        }
        else
        {
            System.out.print("Not found");
        }

    }

    static int associateTech(WatchSol[] aobj, String st)
    {
        int count=0;

        for (int i = 0; i < aobj.length; i++)
        {
            // String m=aobj[i].getBrand();
            String m=aobj[i].brand;

            String m1=m.toLowerCase();
            
            String st1=st.toLowerCase();

            if(m1.equals(st1))
            {
                if (st1.charAt(0)=='a'||st1.charAt(0)=='e'||st1.charAt(0)=='i'||st1.charAt(0)=='o'||st1.charAt(0)=='u')
                {
                    count++;
                }
            }
            
        }

        return count;
    }
    
}