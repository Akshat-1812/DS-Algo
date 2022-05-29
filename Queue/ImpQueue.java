package Queue;

// front->|1|||||<-rear
class Queue
{
    int rear,front,cur_size;
    int  ar[];
    int cap;

    Queue(int cap)
    {
        this.cap=cap;
        rear=cap-1;
        front=cur_size=0;
        ar = new int[this.cap];
    }

    boolean isFull(Queue que)
    {
        return (que.cur_size==que.cap);
    }

    boolean isEmpty(Queue que)
    {
        return (que.cur_size==0);
    }

    void enQueue(int x) //insert from rear
    {
        if(isFull(this))
            return;

        rear = (rear+1) % cap;
        ar[rear]=x;
        cur_size++;

        System.out.println("Item inserted "+ x );
    }
    
    int deQueue() //delete from front
    {
        if(isEmpty(this))
        return Integer.MIN_VALUE;
        
        int x = ar[front];
        front = (front+1) % cap;
        cur_size--;
        
        return x;
    }

    int front()
    {
        if(isEmpty(this))
            return Integer.MIN_VALUE;

        int x = ar[front];

        return x;
    }

    int rear()
    {
        if(isFull(this))
            return Integer.MIN_VALUE;

        return  this.ar[this.rear];
    }

    void print()
    {
        for (int i = front; i <= rear; i++)
        {
            System.out.println(ar[i]);   
        }
    }
}

class ImpQueue
{
    public static void main(String[] args)
    {
        Queue q1=new Queue(1000);
        
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        // q1.enQueue(50);
        
        System.out.println("Item Deleted "+ q1.deQueue());
        
        q1.enQueue(100);
        q1.enQueue(2000);

        System.out.println("Current front "+ q1.front());
        System.out.println("Current rear "+ q1.rear());

        q1.print();
    }
}