package array;
import java.util.*;
public class ques83 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no. of rows for 2d array");
      int r=sc.nextInt();
      System.out.println("Enter the no. of rows for 2d array");
      int c=sc.nextInt();
      int arr[][]=new int [r][c];
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              arr[i][j]=sc.nextInt();
          }
      }
      System.out.println("enter the shwll n o. which you want to rotate");
      int s=sc.nextInt();
      System.out.println("enter the rotations");
      int rotate=sc.nextInt();
      rotateshell(arr,s,r);
      display(arr);
    }
    
    public static void rotateshell  (int arr[][],int s,int r){
        int oned[]=fillonedfromshell(arr,s);
        rotate(oned,r);
        fillshellfromoned(arr,s,oned);
    }
    
   public static void rotate(int oned[],int r){
       r=r%oned.length;
       if(r<0){
           r=r+oned.length;
       }
       
       reverse(oned,0,oned.length-1-r);
       reverse(oned,oned.length-r,oned.length-1);
       reverse(oned,0,oned.length-1);
   }
   
   
   public static void   reverse(int []oned,int li, int ri){
       while(li<ri){
           int temp=oned[li];
           oned[li]=oned[ri];
           oned[ri]=temp;
           li++;
           ri--;
       }
   }
   
  public static int[] fillonedfromshell(int arr[][],int s){
  int minrow=s-1;
  int mincol=s-1;
  int maxrow=arr.length-s-1;
  int maxcol=arr[0].length-s-1;
  int sz= 2*(maxrow-minrow+maxcol-mincol);
  int oned[]=new int[sz];
  
  int idx=0;
  //leftwall
  for(int i=minrow,j=mincol;i<=maxrow;i++){
      oned[idx]=arr[i][j];
      idx++;
  }
  
  //bottomwall
  for(int i=maxrow,j=mincol+1;j<=maxcol;j++){
      oned[idx]=arr[i][j];
      idx++;
  }
  //rightwall
   for(int i=maxrow-1,j=maxcol;i>=minrow;i--){
      oned[idx]=arr[i][j];
      idx++;
  }
   
   //topwall
    for(int i=minrow,j=maxcol-1;j>=mincol+1;j--){
      oned[idx]=arr[i][j];
      idx++;
  }
   
  return oned;
      
  } 
  
  public static int[] fillshellfromoned(int arr[][],int s,int oned[]){
      int minrow=s-1;
  int mincol=s-1;
  int maxrow=arr.length-s-1;
  int maxcol=arr[0].length-s-1;
  int idx=0;
  //leftwall
  for(int i=minrow,j=mincol;i<=maxrow;i++){
     arr[i][j]= oned[idx];
      idx++;
  }
  
  //bottomwall
  for(int i=maxrow,j=mincol+1;j<=maxcol;j++){
      arr[i][j]=oned[idx];
      idx++;
  }
  //rightwall
   for(int i=maxrow-1,j=maxcol;i>=minrow;i--){
      arr[i][j]=oned[idx];
      idx++;
  } 
   //topwall
    for(int i=minrow,j=maxcol-1;j>=mincol+1;j--){
      arr[i][j]=oned[idx];
      idx++;
  } 
  return oned;     
  } 
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }  
}
