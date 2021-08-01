class Solution {
    public int largestIsland(int[][] grid) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=grid.length;
        map.put(0,0);
        int gridId=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int size=assignIdAndReturnArea(grid,i,j,gridId);
                    map.put(gridId,size);
                    gridId++;
                }
                
            }
        }
        
        int res=map.getOrDefault(2,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    Set<Integer>set=new HashSet<>();
                    set.add(i>0?grid[i-1][j]:0);
                    set.add(i<n-1?grid[i+1][j]:0);
                    set.add(j>0?grid[i][j-1]:0);
                    set.add(j<n-1?grid[i][j+1]:0);
                    
                    int totalArea=1;
                    for(int id:set){
                        totalArea+=map.get(id);
                        res=Math.max(totalArea,res);
                    }
                }
            }
        }
        return res;
        
    }
    
   private int assignIdAndReturnArea(int[][] grid, int i, int j, int id) {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) return 0;
    grid[i][j] = id;
    return 1 + assignIdAndReturnArea(grid, i + 1, j, id) + assignIdAndReturnArea(grid, i - 1, j, id) + assignIdAndReturnArea(grid, i, j + 1, id) + assignIdAndReturnArea(grid, i, j - 1, id);
  }
}
