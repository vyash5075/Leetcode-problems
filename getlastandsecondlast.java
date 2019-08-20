import java.util.*;

  class Node{                                      // create a  single link list with insertion beginning   and print last and secondd last element
  int data;
  Node address=null;
  }
  class getlastandsecondlast                //to place pointer to the last and second last node
{
		public static void main(String args[])
		{
			int n;
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the no. of nodes");
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
							p.address=start;
							start=p;
						}
				}
        System.out.println("last and 2nd last nodes are");
				Node ptr;
				Node previous;
				ptr=start;
				previous=start;
				while(ptr.address!=null)
				{
					previous=ptr;
					ptr=ptr.address;
                }
					
                    System.out.println(previous.data);
					System.out.println(ptr.data);
				
		}
	}
					
