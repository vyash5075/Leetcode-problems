class Solution {
    public int myAtoi(String str) {
       
//         s=s.trim();
//         int n=s.length();
//        String m="";
//         int sum=0;
//       for(int i=0;i<n;i++)
//       {
//            if(s.charAt(i)==' ')
//           {
//               break;
//           }
//          else  if(s.charAt(0)=='+'&&s.length()==1||s.charAt(0)=='-'&&s.length()==1)
//           {
//             break;
             
//           }
//           else if((s.charAt(0)=='-'&&s.charAt(1)=='+')||(s.charAt(0)=='+'&&s.charAt(1)=='-'))
//           {
//               break;
//           }
           
//          else if((s.charAt(0)=='+'&&s.charAt(i)<='9')||(s.charAt(0)=='-'&&s.charAt(i)<='9')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))
//           {
            
//                            m=m+s.charAt(i);
//              if(s.charAt(i)>='0'&&s.charAt(i)<='9')
//              {
//                  sum=sum+s.charAt(i);
//              }
          
              
//           }
//           else{break;}
//       }
//       if(m=="")
//       {
//          return 0;
//       }
     
//          else if(m.length()>8&&m.charAt(0)=='-'&&sum>47)
//       {
//          return( Integer.MIN_VALUE);
//       }
//           else if(m.length()>8&&sum>47)
//       {
//          return( Integer.MAX_VALUE);
//       }
//         else if(m.charAt(0)=='+'&&m.length()==1||m.charAt(0)=='-'&&m.length()==1)
//         {
//             return 0;
//         }
       
//       else{
       
//         return(Integer.valueOf(m));
//     }
       
        
//     } 
    if (str == null || str.isEmpty()) return 0;
        int ptr = 0, sign = 1, num = 0;
        while (ptr < str.length() && str.charAt(ptr) == ' ') ptr++;
        if (ptr >= str.length()) return 0;
        if (str.charAt(ptr) == '+' || str.charAt(ptr) == '-') {
            sign = (str.charAt(ptr) == '+') ? 1 : -1;
            ptr++;
        }
        
        while (ptr < str.length()) {
            Character c = str.charAt(ptr);
            ptr++;
            if (!Character.isDigit(c) && num == 0) return num;
            else if (!Character.isDigit(c) && num != 0) break;
            else if (!Character.isDigit(c)) continue;
            
            int digit = c - '0';
            
            long numLong = (long) num;
            boolean isOverflow = numLong != num;
            if(Integer.MAX_VALUE/10 < num || Integer.MAX_VALUE/10 == num && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            num = num * 10 + digit;
        }

        return sign * num;
}
}
