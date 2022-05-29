import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java.util.stream.*;
import java.util.*;
import java.time.*;



/*
find the longest substring starts with char A & ends with A; & has char B
in between.
*/
interface intA
{
    default String getId()
    {
        return "Interface A";
    }
}

interface intB extends intA
{
    default String getId()
    {
        return "Interface B";
    }
}


public class Test
{


    @FunctionalInterface
    interface TwoArg
    {
        int twoA(int a,int b);
    }

    public void testLocalDateTime()
    {
        LocalDateTime ind = LocalDateTime.now();


        // LocalDate fin = ind.plus(Period.ofDays(5));

        // fin=ind.plus(Period.ofDays(10));
        // fin=LocalDate.parse("2020-09-01");

        // LocalDate fd=localD.plus(5);
        System.out.print(ind);
        // System.out.println(" "+localD.getDayOfWeek());


    }

    public void orElseGetMethod()
    {
        Optional <String> optional = Optional.ofNullable("value found");
       
        String orElseGetResult = optional.orElseGet(this::getFunctionForTest);
        System.out.println("value in orElseGetResult " + orElseGetResult);
        
    }
        
    public String getFunctionForTest()
    { 
        System.out.println("\n ===== function called ======"); 
        return "default value";
        
    }

    public static void main(String[] args)
    {
       
		Test t1=new Test();
        // // TwoArg add=(a,int b) -> a + b;
        // System.out.println(add.twoA(10,5));
        // t1.testLocalDateTime();
        // t1.orElseGetMethod();
        // t1.getId();
        intB b=new intB(){};
        // System.out.println(b.super.getId);





        // Instant s=Instant.parse("2020-10-03T10:15:30.00Z");
        // Instant e=Instant.parse("2020-10-03T10:16:30.00Z");

        // Duration d=Duration.between(s,e);

        // System.out.println(d.getSeconds());

        List<String> n=Arrays.asList("9","A","Z","1","B","Y","4","a","c");
       
        List<Integer> n2=Arrays.asList(2,3,4,5); 

        // Map<String,Long>res=n.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // System.out.println(res);

        // List<String> sl=n.stream().sorted().collect(Collectors.toList());
        // sl.forEach(System.out::println);



        // boolean res=n.stream().anyMatch(n1->(n1*(n1+1)) / 4==5 );

        // List sq=n.stream().map(x->x*x).collect(Collectors.toList());
        // System.out.println(n2.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i));

       


        
        // String s1=1+2+"imp"+3+"etus"+4+5;
        // char a='d';
        // char b='s';

        // int low=0;
        // int high=s1.length()-1;
        
        // char[] ch=s1.toCharArray();
        // int count=0;
        // boolean flag=false;

        // while (low<high)
        // {
        //     if(ch[low]!=a)
        //     {
        //         low++;
                
        //     }   
        //      if(ch[high]!=a)
        //     {
        //         high--;
        //     }
            
        //     if(ch[low]==a && ch[high]==a)
        //     {
        //         for (int i = low+1; i <=high-1; i++)
        //         {
        //             if(ch[i]==b)
        //             {
        //                 count=(high-low)+1;
        //                 System.out.println(count);
        //                 flag=true;
        //                 break;
        //             }
        //         }
        //     } 
            
        //     if(flag)
        //     {
        //         break;
        //     }

        // }
    
        

    }


   
}
    