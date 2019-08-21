import java.util.*;

class Node{
int data;
Node address=null;
}
public class mergetwonodes
{
public static void main(String args[])
    {
    int n;
    Node start=null;
     Node start1=null;
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the  no. of elements");
    n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        Node temp=new Node();
        temp.data=sc.nextInt();
        temp.address=null;
        if(start==null)
        {
            start=temp;
        }
        else
        {
            Node ptr=start;
            Node previous=start;
            while(ptr!=null&&ptr.data<temp.data)
            {
                 previous=ptr;   
                 ptr=ptr.address;
            }
                if(start==ptr)
            {
                temp.address=start;
                start=temp; 
            }   
            else if(ptr==null)
            {
                previous.address=temp;
            }
             else
            {
                temp.address=ptr;
                previous.address=temp;
            }
        }
    }
    System.out.println("sorted list 1 is given below");
    Node ptr2=start;
    while(ptr2!=null)
    {
    System.out.println(ptr2.data);
    ptr2=ptr2.address;
    }
    
    
    System.out.println("enter the no. of elements of list 2");
    int m=sc.nextInt();
    for(int j=0;j<m;j++)
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
    System.out.println("sorted list 2 is given below");
    Node ptr3=start1;
    while(ptr3!=null)
    {
        System.out.println(ptr3.data);
        ptr3=ptr3.address;
    }
    Node pttr=start1;
   
    while(pttr!=null)
    {
         Node temp=new Node();
         temp.data=pttr.data;
        Node pptr=start;
        Node prevv=start;
        while(pptr!=null&&pptr.data<temp.data)
        {
            prevv=pptr;
            pptr=pptr.address;
        }
        if(pptr==start)
        {  
            temp.address=start;
            start=temp;
            
        }
        else if(pptr==null)
        {
            prevv.address=temp;
            temp.address=null;
        }
        else
        {
            temp.address=pptr;
            prevv.address=temp;
        }
        pttr=pttr.address;
    }
    
    System.out.println("merging of 2 nodes are");
    Node ptr6=start;
    while(ptr6!=null)
    {
        System.out.println(ptr6.data);
        ptr6=ptr6.address;
    }
   
    }


}
