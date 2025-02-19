import java.util.ArrayList;
import java.util.List;

// TreeNode structure
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}




public class Morris {
    // Function to perform iterative Morris
    // inorder traversal of a binary tree
    public List<Integer> getInorder(TreeNode root) {
        // List to store the
        // inorder traversal result
        List<Integer> inorder = new ArrayList<>();
        // Pointer to the current node,
        // starting from the root
        TreeNode cur = root;

        // Loop until the current
        // node is not NULL
        while (cur != null) {
            // If the current node's
            // left child is NULL
            if (cur.left == null) {
                // Add the value of the current
                // node to the inorder list
                inorder.add(cur.val);
                // Move to the right child
                cur = cur.right;
            } else {
                // If the left child is not NULL,
                // find the predecessor (rightmost node
                // in the left subtree)
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                // If the predecessor's right child
                // is NULL, establish a temporary link
                // and move to the left child
                if (prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                } else {
                    // If the predecessor's right child
                    // is already linked, remove the link,
                    // add current node to inorder list,
                    // and move to the right child
                    prev.right = null;
                    inorder.add(cur.val);
                    cur = cur.right;
                }
            }
        }

        // Return the inorder
        // traversal result
        return inorder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        Solution sol = new Solution();

        List<Integer> inorder = sol.getInorder(root);

        System.out.print("Binary Tree Morris Inorder Traversal: ");
        for (int i = 0; i < inorder.size(); i++) {
            System.out.print(inorder.get(i) + " ");
        }
        System.out.println();
    }
}


//        1
//       / \
//      2   3
//     / \
//    4   5
//         \
//          6


//          Traversal Flow (Step-by-step):

// Start at 1. It has a left child, so find the predecessor (node 6).
// Create a temporary link from 6 to 1 and move to 2.
// At 2, find its predecessor (5). Create a link from 5 to 2 and move to 4.
// At 4, no left child. Add 4 to the result and move to 2 (via the link).
// Remove the link, add 2 to the result, and move to 5.
// At 5, no left child. Add 5 to the result and move to 6.
// At 6, no left child. Add 6 to the result and move to 1 (via the link).
// Remove the link, add 1 to the result, and move to 3.
// At 3, no left child. Add 3 to the result and finish.
// Result: 4, 2, 5, 6, 1, 3