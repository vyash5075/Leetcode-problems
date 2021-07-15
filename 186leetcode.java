class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length;
        int n=box[0].length;
        for(int i=0;i<m;i++){
            Queue<Integer>ql=new PriorityQueue<Integer>(Collections.reverseOrder());
            for(int j=n-1;j>=0;j--){
                if(box[i][j]=='.'){
                    
                    ql.add(j);
                    System.out.println(j+","+ql.peek()+ql);
                }
                else if(box[i][j]=='*'){
                    while(ql.size()>0){
                        ql.remove();
                    }
                }
                else if(box[i][j]=='#'){
                    if(ql.size()>0){
                        int index=ql.peek();
                       // System.out.println("i"+ index+","+j);
                        box[i][index]='#';
                        ql.remove();
                        box[i][j]='.';
                        ql.add(j);
                        System.out.println("p"+j +ql.peek());
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(box[i][j]+" ");
                }
            System.out.println();
            
            }
            int k=m-1;
            char result[][]=new char[n][m];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    result[j][k]=box[i][j];
                }
                k--;
            }
        
        return result;
    }
}
