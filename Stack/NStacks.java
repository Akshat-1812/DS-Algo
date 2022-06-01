public class NStacks 
{
    int arr[];
    int top[];
    int next[];

    int n;
    int s;

    int freespot;

    NStacks(int n,int s)
    {
        this.n = n;
        this.s = s;

        arr = new int[n];
        top = new int[s];
        next = new int[n];

        //top initialise
        for (int i = 0; i < s; i++) 
        {
            top[i] = -1;
        }

        //next initialise
        for (int i = 0; i < n; i++) 
        {
            next[i] = i+1;
        }

        //update last index value to -1
        next[n-1] = -1;

        //initialise freespot
        freespot = 0;

    }

    private boolean push(int x, int m) //x: element , m: stack no.
    {
        //check for overflow
        if(freespot == -1)
        {
            System.out.println("overflow");
            return false;
        }

        //find index
        int index = freespot;

        //update freespot
        freespot = next[index];

        //insert element into array
        arr[index] = x;

        //update next --> purana top // previous of top
        next[index] = top[m-1];

        //update top
        top[m-1] = index;

        System.out.println("pushed in stack : "+ m+ " "+ x);
        
        return true;
    }

    private int pop(int m) 
    {
        //check for underflow
        if(top[m-1] == -1)
        {
            System.out.println("underflow");
            return -1;
        }

        //write push() function in reverse way

        int index = top[m-1];

        top[m-1] = next[index];

        next[index] = freespot;

        freespot = index;

        return arr[index];

    }

    public static void main(String[] args) 
    {
        int n = 5; // size of array  
        int s = 3; // no. of  stacks

        NStacks ns = new NStacks(n, s);
        
        System.out.println("push : " + ns.push(10,1)); // element 10 in stack 1
        System.out.println("push : " + ns.push(20,1)); // element 10 in stack 1
        System.out.println("push : " + ns.push(30,2)); // element 10 in stack 1

        System.out.println("pop : " + ns.pop(1)); //pop from stack 1
        System.out.println("pop : " + ns.pop(2));//pop from stack 2


    }

    
    
}
