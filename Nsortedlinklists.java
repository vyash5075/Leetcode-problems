import java.util.*;
class Nodee{
    int data;
    Node address=null;
}
public class Nsortedlinklists {
    public static   void main(String args[])
    {
        int n;
        int m;
        int count=0;
       // Node start=null;
        Node start1=null;
          Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of lists");
        m=sc.nextInt(); 
        System.out.println("enter the no of nodes");
        
      
        n=sc.nextInt();
        
    for(int i=0;i<=m;i++)
    {
        System.out.println("enter elements of node "+count);
     for(int j=0;j<n;j++)
    {
         Node temp1=new Node();
        temp1.data=sc.nextInt();
        temp1.address=null;
        if(start1==null)
        {
            start1=temp1;
        }
        else
        {
            Node ptrr=start1;
            Node prev=start1;
            while(ptrr!=null&&ptrr.data<temp1.data)
            {
                 prev=ptrr;   
                 ptrr=ptrr.address;
            }
                if(start1==ptrr)
            {
                temp1.address=start1;
                start1=temp1; 
            }   
            else if(ptrr==null)
            {
                prev.address=temp1;
            }
             else
            {
                temp1.address=ptrr;
                prev.address=temp1;
            }
        }
    }
    System.out.println("sorted list is given below");
    Node ptr3=start1;
    while(ptr3!=null)
    {
        System.out.println(ptr3.data);
        ptr3=ptr3.address;
    }
    count++;
    }
       
    
        
    }
}
