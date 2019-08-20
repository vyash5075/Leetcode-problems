import java.util.*;
class Node{
    int data;
    Node address=null;
}
public class summationofnodes {
    public static void main(String args[])
    {
        int n;
        int sum=0;
        Node start=null;
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of nodes");
       n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           Node temp=new Node();
           temp.data=sc.nextInt();
           if(start==null)
           {
               start=temp;
           }
           else{
               temp.address=start;
               start=temp;
           }
       }
           Node ptr=start;
           while(ptr!=null)
           {
               sum=sum+ptr.data;
                ptr=ptr.address;
                 
           }
            System.out.println( "sum is"+sum);
           
           
       
        
    }
    
}
