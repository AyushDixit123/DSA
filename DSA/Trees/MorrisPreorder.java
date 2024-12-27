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

public class MorrisPreorder {
    // Function to perform Morris preorder traversal
    public List<Integer> getPreorder(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        TreeNode cur = root;

        while (cur != null) {
            // If left child is null, visit the current node
            if (cur.left == null) {
                preorder.add(cur.val);  // Add current node to result
                cur = cur.right;        // Move to the right child
            } else {
                // Find the inorder predecessor
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                // If no link exists, establish it and visit the current node
                if (prev.right == null) {
                    preorder.add(cur.val);  // Add current node to result
                    prev.right = cur;       // Create a temporary link
                    cur = cur.left;         // Move to the left child
                } else {
                    // If link exists, remove it and move to the right child
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return preorder;
    }

    public static void main(String[] args) {
        // Construct a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        MorrisPreorder morris = new MorrisPreorder();

        // Perform Morris preorder traversal
        List<Integer> preorder = morris.getPreorder(root);

        // Print the result
        System.out.print("Binary Tree Morris Preorder Traversal: ");
        for (int val : preorder) {
            System.out.print(val + " ");
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

// Start at 1. Add 1 to result, find predecessor 6, create link, move to 2.
// At 2, add 2 to result, find predecessor 5, create link, move to 4.
// At 4, no left child. Add 4 to result, move to 2 (via link).
// Remove link, move to 5. Add 5 to result, move to 6.
// At 6, no left child. Add 6 to result, move to 1 (via link).
// Remove link, move to 3. Add 3 to result, finish.
// Result: 1, 2, 4, 5, 6, 3