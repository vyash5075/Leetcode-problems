class Node
{
    int data;
     Node left=null;
     Node right=null;
     
}

class searching_item{
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
        System.out.println("enter the item to search");
        int u=sc.nextInt();
        boolean a=search(root,u);
        System.out.println("element is "+a);
    }
    public static boolean search(Node root,int n)
    {
       
      
       
       if(root!=null)
       {
                if(root.data==n)
                {
                     return true;
                }
                else if(root.data>n)
                {
                    root=root.left;
                     return search(root,n);
                }
                 else if(root.data<n)
                {
                    root=root.right;
                     return   search(root,n);
                }
        }
        return false;   
       }
}
