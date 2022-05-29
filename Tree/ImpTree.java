package Tree;

//package Tree;
//binary search tree
class ImpTree
{
    Node root;

    class Node
    {
        int data;
        Node left , right;

        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }   
//-------------------------------------------------------------//

    Node insert(Node root,int x)
    {
        if(root==null)
        {
            root=new Node(x);
            return root;
        }

        if(root.data>x)//x samll put it in left.
        {
            root.left=insert(root.left, x);
        }
        else if(root.data<x)
        {
            root.right=insert(root.right, x);
        }

        return root;
    }

//-------------------------------------------------------------//

    Node search(Node root, int x)
    {
        if(root==null || root.data==x )
            return root;
        
        if(root.data > x)
        {
            return search(root.left,x);
        }

        return search(root.right, x);
    }

//-------------------------------------------------------------//
    void inOrder(Node root)//left root right
    {
        if(root==null)
            return;
        
        inOrder(root.left);
        System.out.print(root.data+ " " );
        inOrder(root.right);
    }

    void preOrder(Node root)//root left right
    {
        if(root==null)
            return;
        
        System.out.print(root.data+ " " );
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root)//left right root
    {
        if(root==null)
            return;
        
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+ " " );
    }

//-----------------------------------------------------------------//

    void insertNode(int x) //this is how we are calling insert()
    {
        root = insert(root,x);
        //System.out.println(root.data);
    }

    void searchNode(int x) //this is how we are calling search()
    {
        root = search(root,x);
        
        if(root!=null)
        {
            System.out.println("found");
            return;
        }
        else
        {
            System.out.println("not found");
            return;
        }
        
    }

    void treeInOrder()
    {
        inOrder(root);
        System.out.println();
    }

    void treePreOrder()
    {
        preOrder(root);
        System.out.println();
    }

    void treePostOrder()
    {
        postOrder(root);
        System.out.println();
    }

//-------------------------------------------------------------//
    
    public static void main(String[] args)
    {
        ImpTree t1 = new ImpTree();
        
        //t1.root=new Node(20);
        
        t1.insertNode(20);
        t1.insertNode(10);
        t1.insertNode(30);
        t1.insertNode(15);
        t1.insertNode(35);
        
        System.out.println("In order");
        t1.treeInOrder();

        System.out.println("Pre order");
        t1.treePreOrder();
        
        System.out.println("Post order");
        t1.treePostOrder();

        t1.searchNode(40);
    }

}
