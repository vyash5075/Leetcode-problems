/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
*/





class Solution {
    public String convert(String s, int numRows) {
        char arr[]=new char[s.length()];
        if(numRows>s.length()||numRows<1)
        {
            return s;
        }
        if(s.length()==1||numRows==1)
        {
            return s;
        }
        int interval=2*numRows-2;
        int count=0;
        for(int i=0;i<numRows;i++)
        {
            int step=interval-2*i;
            for(int j=i;j<s.length();j+=interval)
            {
                if(j<s.length())
                {
                    
                
                arr[count]=s.charAt(j);
                count++;
                }
                if(step>0 &&step<interval&&j+step<s.length())
                {
                    arr[count]=s.charAt(j+step);
                    count++;
                }
            }
        }
     //   String str= new String(arr)
        return new String(arr);
        
    }
}
