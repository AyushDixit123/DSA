import java.util.*;
 /* Definition for a binary tree node.*/
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
        this.right = right;
      }
  }


class Practice {
  public int nextItem(TreeNode root, int target) {
      Queue<TreeNode> queue = new ArrayDeque<>();
      queue.offer(root);
      int ans = 0;

      if(root == null){
          return -1;
      }

      while(!queue.isEmpty()){
              TreeNode currentNode = queue.poll();
              if(currentNode.left != null){
                  queue.offer(currentNode.left);
              }
              if(currentNode.right != null){
                  queue.offer(currentNode.right);
              }
              if(currentNode.val == target){
                ans  = queue.isEmpty()?-1:queue.peek().val;
                break;
              }


      }
      return ans;




  }
  public static void main(String[] args) {

  }
}