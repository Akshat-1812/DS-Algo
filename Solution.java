import java.util.*;

class Associate
{
    private int id;
    private String name;
    private String technology;
    private int exp;

    Associate(int id,String name,String technology,int exp)
    {
        this.id=id;
        this.name=name;
        this.setTechnology(technology);
        this.setExp(exp);
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Associate[] aobj= new Associate[n];
        
        for (int i = 0; i <n; i++)
        {
            aobj[i]=new Associate(sc.nextInt(),sc.next(), sc.next(),sc.nextInt());
        }

        String st=sc.next();

        sc.close();

        Associate res[]=associateTech(aobj,st);

        for (int i = 0; i < res.length; i++)
        {
            System.out.println(res[i].getId());
        }

    }

    static Associate[] associateTech(Associate[] aobj, String st)
    {
        Associate[] ans= new Associate[0];

        for (int i = 0; i < aobj.length; i++)
        {
            String m=aobj[i].getTechnology();
            String m1=m.toLowerCase();
            String st1=st.toLowerCase();

            if(m1.equals(st1))
            {
                ans=Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = aobj[i];
            }
            
        }

        return ans;
    }
    
}
