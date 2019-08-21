importjava.util.*;
class nodettt{
    int data;
    Node address=null;
}
public class drivenmenu {
    public static void main(String args[])
    {
        int n;
        
        Node start=null;
        System.out.println("enter the no. of nodes");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter data");
         for(int i=0;i<n;i++)
       {
           Node temp=new Node();
           temp.data=sc.nextInt();
           if(start==null)
           {
               start=temp;
           }
           else{
               Node p=start;
               while(p.address!=null)
               {
                  p=p.address;
               }
               p.address=temp;
           }
       }
        
         int y=1;
           while(y!=0)
           {
           System.out.println("choose any of item given below ");
           System.out.println("1.) insertion");
            System.out.println("2.)deletion");
            int m;
            System.out.println("enter choice");
            m=sc.nextInt();
            switch(m)
                    {
                case 1:
                {
                    System.out.println("welcome u choose insertion");
                    int item;
                    int pos;
                    System.out.println("enter the position u want to insert item");
                    pos=sc.nextInt();
                    System.out.println("enter the item u want to insert item");
                    item=sc.nextInt();
                    Node temp4=new Node();
                    temp4.address=null;
                    temp4.data=item;
                    if(pos==0)
                    {
                       temp4.address=start;
                       start=temp4;
                    }
                    else if(pos==n)
                    {
                        Node t=start;
                        while(t.address!=null)
                        {
                            t=t.address;
                        }
                        t.address=temp4;
                    }
                    else if(pos>0&&pos<n)
                    {
                        Node o=start;
                        Node w=start;
                        while(pos!=0)
                        {
                            o=w;
                            w=w.address;
                            pos--;
                        }
                        temp4.address= w;
                        o.address=temp4;
                    }
                    else
                    {
                        System.out.println("invalid input");
                    }
                    System.out.println("current list is");
                    Node ptr=start;
           while(ptr!=null)
           {
               System.out.println(ptr.data);
                ptr=ptr.address;
                 
           }
                    
                    break;
                }
                case 2:
                {
                 System.out.println("welcome u choose deletion");
                 System.out.println("enter the position u want to delete");
                 int poss=sc.nextInt();
                 Node u=start;
                 Node v=start;
                 if(poss==0)
                 {
                     start=u.address;
                     u.address=null;
                 }
                 else if(poss>0&&poss<n)
                 {
                 while(poss!=0)
                 {
                     u=v;
                     v=v.address;
                     poss--;
                 }
                 u.address=v.address;
                 v.address=null;
                 }
                 else if(poss==n)
                 {
                  while(v.address!=null)
                  {
                      u=v;
                      v=v.address;
                  }
                  u.address=null;
                  v=null;
                 }
                 else if(poss>n)
                 {
                     System.out.println("invalid position");
                 }
                 else
                 {
                     System.out.println("invalid position");
                 }
                 System.out.println("current list is");
                 Node ptr2=start;
           while(ptr2!=null)
           {
               System.out.println(ptr2.data);
                ptr2=ptr2.address;
                 
           }
                 break;
                
                } 
                default:
                {
                    System.out.println("invalid input try again");
                    break;
                }
                
            }
            System.out.println("do you wanna continue or not if yes press 1 other wise press 0 ");
            y=sc.nextInt();
           }
    }
}
         
