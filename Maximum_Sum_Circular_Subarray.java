/*
Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.
Example 1:

Input: [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3
Example 2:

Input: [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10
Example 3:

Input: [3,-1,2,-1]
Output: 4
Explanation: Subarray [2,-1,3] has maximum sum 2 + (-1) + 3 = 4
Example 4:

Input: [3,-2,2,-3]
Output: 3
Explanation: Subarray [3] and [3,-2,2] both have maximum sum 3
Example 5:

Input: [-2,-3,-1]
Output: -1
Explanation: Subarray [-1] has maximum sum -1
*/

public class maxsubarray{
public static void main(String args[])
{
int arr={-2,-3,-1};
System.out.println(maxSubarraySumCircular(arr));
}
    public int maxSubarraySumCircular(int[] A) {
        int flag=0;
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<0)
            {
                flag=1;
                count++;
            }
        }
        int l=Integer.MIN_VALUE;
        if(flag==1&&count==A.length)
        {
            for(int i=0;i<A.length;i++)
            {
                if(A[i]>l)
                {
                    l=A[i];
                }
            }
            return l;
        }
        else{
            
        
        int maxofarray= kadane(A);
        
        int maxofinvertedarray=0;
        for(int i=0;i<A.length;i++)
        {
            maxofinvertedarray+=A[i];
            A[i]=-A[i];
        }
        maxofinvertedarray=maxofinvertedarray+kadane(A);
        return  maxofinvertedarray>maxofarray?maxofinvertedarray:maxofarray;
    }
    
    public static int kadane(int A[])
    {
       
        int n=A.length;
        int start=0;
        int end=0;
        int s=0;
        int max_so_far=Integer.MIN_VALUE;
        int max_ending=0;
        for(int i=0;i<n;i++)
        {
            max_ending+=A[i];
            if(max_so_far<max_ending)
            {
                max_so_far=max_ending;
                start=s;
                end=i;
            }
            if(max_ending<0)
            {
                max_ending=0;
                s=i+1;
            }
        } 
        return max_so_far;
    }


}
