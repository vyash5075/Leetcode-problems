import java.util.*;
class Node
{
    int data;
    Node left=null;
    Node right=null;
    
}
public class preordertraversing {
    public static void main(String args[])
    {
        int n;
        Node root=null;
        Node t=null;
        Node parent=null;
        System.out.println("enter the no. of elements");
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
            else
            {
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
        System.out.println("elements in preorder are");
         preorder(root);
         
    }
   static void preorder(Node root)
{
if(root!=null)
{
    
System.out.println(root.data);
preorder(root.left);
preorder(root.right);
}
}    
}
