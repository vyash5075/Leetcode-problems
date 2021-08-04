/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>allsum=new ArrayList<>();
        if(root==null)return allsum;
        
    dfs(root,new ArrayList(),allsum,targetSum);
        return allsum;
    }
    
    public   void dfs(TreeNode root,List<Integer>path, List<List<Integer>>allpath,int target){
        path.add(root.val);
        if(root.left!=null){
            dfs(root.left,path,allpath,target-root.val);
            
        }
        
         if(root.right!=null){
            dfs(root.right,path,allpath,target-root.val);
            
        }
        
        if(root.left==null&&root.right==null){
            if(target==root.val){
                allpath.add(new ArrayList(path));
            }
        }
        
        path.remove(path.size()-1);
    }
}
