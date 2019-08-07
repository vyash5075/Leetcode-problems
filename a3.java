import java.util.*;
class node{                                                   // insertion from ending
          int data;
          Node address=null;
          }
  class a3
  {
  public static void main(String args[])
  {
      Scanner sc= new Scanner (System.in);
      int n;
      system.out.println("enter the no. of nodes");
      n=sc.nextInt();
      Node start=null;
      for(int i=0;i<n;i++)
      {
           Node p=new Node();
           p.data=sc.nextInt();
           p.address=null;
           if(start==null)
            {
              start=p;
            }
          else
            {
              Node ptr=start;
              while(ptr.address!=null)
               {
                  ptr=ptr.address;
               }
               ptr.address=p;
            }
     }
  node ref=start;
  while(ref!=null)
     {
       System.out.println(ref.data);
       ref=ref.address;
 
     }
  }
  }
