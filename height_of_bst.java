import java.util.*;
class Node
{
    int data;
     Node left=null;
     Node right=null;
     
}

class height_of_bst{
    public static void main(String args[])
    {
        Node parent=null;
        Node t=null;
        Node root=null;
        int n;
        System.out.println("enter the no. of nodes");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Node temp=new Node();
            temp.data=sc.nextInt();
            if(root==null)
            {
                root=temp;
                }
            else{
                t=root;
                while(t!=null)
                {
                    parent=t;
                    if(t.data>temp.data)
                    {
                        t=t.left;
                    }
                    else
                    {
                       t=t.right;
                    }
                }
                if(parent.data>temp.data)
                {
                    parent.left=temp;
                }
                else
                {
                    parent.right=temp;
                }
            }
            
        }
       int h= height(root);
       System.out.println("height of tree is"+h);
    }
    public static int height( Node root)
    {
        int m;
        int n;
        if(root==null)
        {
            return 0;
        }
        else
        {
            m=height(root.left);
            n=height(root.right);
            if(m>n)
            {
                return(m+1);
            }
            else
            {
            return (n+1);
            }
        }
          
        }
    
}
