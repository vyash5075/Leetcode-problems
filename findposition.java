
  
  
  import java.util.*;
  class Node{                      // search a particular element and find its position
  int data;
  Node address;
  }
  class findposition
   {
  public static void main(String args[])
  {
  int n;
  int item;
  int count=1;
  Scanner sc=new Scanner (System.in);
  Node start=null;
  System.out.println("enter the no. of nodes");
  n=sc.nextInt();
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
					p.address=start;
					start=p;
				}
	}
		
		System.out.println("enter the data item to search");
		item=sc.nextInt();
		Node ptr;
		ptr=start;
		while(ptr!=null && ptr.data!=item)
		{
			ptr=ptr.address;
			count++;
		}
		if(ptr==null)
		{
		System.out.println("not present");
		}
		
		else{
		System.out.println("present on position"+count);
		}
		}
		}
			
	
