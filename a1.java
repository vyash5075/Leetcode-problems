import java.util.*;
class Node{                     //create a link list with 3 nodes
int data;
Node address=null;
}
  class a1
  {
		public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		Node start=null;
		Node temp=new Node();
		temp.data=45;
		start=temp;
		Node temp1=new Node();
		temp1.data=59;
		temp.address=temp1;
		Node temp2=new Node();
		temp2.data=70;
	    temp1.address=temp2;
	    Node  temp3 =new Node();
	    temp3.data=90;
	    temp2.address=temp3;
	    Node ptr;
	    ptr=start;
	    while(ptr!=null)
			{
				System.out.println(ptr.data);
				ptr=ptr.address;
			}
	}
  }
  
