import java.util.*;
class node
        {
    int data;
    node left=null;
    node right=null;
}
public class postordertraversing {
    public static void main(String args[])
    {
        System.out.println("enter the no. of elements");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        node root=null;
        node t=null;
        node parent=null;
        for(int i=0;i<n;i++)
        {
            node temp=new node();
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
        System.out.println("elements arrange in post order are");
        postorder(root);
    }
    static void postorder(node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
            
}
