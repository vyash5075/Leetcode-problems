import java.util.*;
class Nodet
{
 int data;
 Node address=null;
}
public class getduplicatelementsatend {
    public static void main(String args[])
    {
        Node start=null;
        Node start3=null;
        System.out.println("enter the no of Nodes");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Node temp=new Node();
            temp.data=sc.nextInt();
            if(start==null)
            {
                start=temp;
                
            }
            else
            {
                temp.address=start;
                start=temp;
            }
        }
            Node ptr=start;
            while(ptr!=null)
            {
                System.out.println(ptr.data);
                ptr=ptr.address;
            }
            int m;
            System.out.println("enter the data which is present in above list");
            m=sc.nextInt();
            Node ptr1=start;
            int count=0;
            while(ptr1!=null)
            {
                 Node temp3=new Node ();
                    temp3.data=ptr1.data; 
                if (ptr1.data!=m)
                {
                  
                     if(start3==null)
                    {
                        start3=temp3;
                    }
                      else
                    {
                        temp3.address=start3;
                        start3=temp3;
                    }
                    ptr1=ptr1.address;
                    
                    
                }
                else
                {
                    Node pt=start3;
                    while(pt.address!=null)
                    {
                        pt=pt.address;
                    }
                    pt.address=temp3;
                    count++;
                   
                   
                   
                  ptr1=ptr1.address;
                }
               
            }
            
               System.out.println(count);
               System.out.println("now the modified list is");
               Node pr=start3;
               while(start3!=null)
               {
                   System.out.println(pr.data);
                   pr=pr.address;
               }
            
               }
        }
    
    
        
    
