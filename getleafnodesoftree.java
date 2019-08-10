
import java.util.*;
class Node
{
    int data;
    Node left=null;
    Node right=null;
    
}
public class getleafnodesoftree {
    public static void main(String args[])
    {
int n;
Node root=null;
Node parent=null;
Node t=null;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no. of nodes");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
    Node temp=new Node ();
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
System.out.println("leaf node elements are");
cheque(root);

}
static void cheque (Node root)
{
    
    if(root!=null)
    {
        cheque(root.left);
        cheque(root.right);
     if(root.left==null&& root.right==null)
     {
         System.out.println(root.data);
       
     }
     
        
    }
   
}
}

