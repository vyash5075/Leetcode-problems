class Node{                                      // create a  single link list with insertion beginning 
  int data;
  Node address=null;
  }
  class a2
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
				Node ptr;
				ptr=start;
				while(ptr!=null)
					{
						System.out.println(ptr.data);
						ptr=ptr.address;
					}
					
		}
  }
			
  
  
  
  
