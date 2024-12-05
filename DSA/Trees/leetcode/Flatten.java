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
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        preOrder(root);

    }

  public void preOrder(TreeNode node){
    if(node == null){
        return;
    }
    preOrder(node.left); // Recursively flatten the left subtree
    preOrder(node.right); // Recursively flatten the right subtree

    // Flatten the tree
    TreeNode temp = node.right;
    node.right = node.left; // Move left subtree to the right
    node.left = null; // Set left subtree to null
    TreeNode current = node;
    while(current.right != null){
        current= current.right;
}
current.right = temp;

  }
}
/*Let’s break down the **flow of execution step by step** for your `flatten` function using an example binary tree.

---

### **Tree Example**

```
       1
      / \
     2   5
    / \    \
   3   4    6
```

---

### **Flatten Logic Recap**

The goal is to convert this binary tree into a single right-skewed "linked list":

```
1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
```

The flatten function works recursively:
1. Flatten the left subtree.
2. Flatten the right subtree.
3. Move the flattened left subtree to the right of the current node.
4. Append the flattened right subtree after that.

---

### **Step-by-Step Execution**

We will follow the **pre-order traversal**:
- Start at the root.
- Flatten the left subtree first, then the right subtree.

#### **1. Start at Node 1**
- Current node: `1`
- Call `preOrder(node.left)` to flatten the left subtree rooted at `2`.

---

#### **2. Move to Node 2**
- Current node: `2`
- Call `preOrder(node.left)` to flatten the left subtree rooted at `3`.

---

#### **3. Move to Node 3**
- Current node: `3`
- Call `preOrder(node.left)` → `null` (base case, return).
- Call `preOrder(node.right)` → `null` (base case, return).
- No children to move, so return to `2`.

---

#### **4. Back to Node 2**
- Call `preOrder(node.right)` to flatten the right subtree rooted at `4`.

---

#### **5. Move to Node 4**
- Current node: `4`
- Call `preOrder(node.left)` → `null` (base case, return).
- Call `preOrder(node.right)` → `null` (base case, return).
- No children to move, so return to `2`.

---

#### **6. Back to Node 2**
- **Flattening at Node 2**:
  - Store `node.right` (pointing to `4`) in `temp`.
  - Move `node.left` (subtree `3`) to `node.right`.
  - Traverse to the end of the new right subtree (reaching `3`).
  - Attach `temp` (subtree `4`) at the end of the right subtree.

  After this step, subtree rooted at `2` becomes:
  ```
  2
   \
    3
     \
      4
  ```

- Return to `1`.

---

#### **7. Back to Node 1**
- Call `preOrder(node.right)` to flatten the right subtree rooted at `5`.

---

#### **8. Move to Node 5**
- Current node: `5`
- Call `preOrder(node.left)` → `null` (base case, return).
- Call `preOrder(node.right)` to flatten the subtree rooted at `6`.

---

#### **9. Move to Node 6**
- Current node: `6`
- Call `preOrder(node.left)` → `null` (base case, return).
- Call `preOrder(node.right)` → `null` (base case, return).
- No children to move, so return to `5`.

---

#### **10. Back to Node 5**
- **Flattening at Node 5**:
  - No left subtree, so nothing to move.
  - Return to `1`.

---

#### **11. Back to Node 1**
- **Flattening at Node 1**:
  - Store `node.right` (subtree `5`) in `temp`.
  - Move `node.left` (subtree `2`) to `node.right`.
  - Traverse to the end of the new right subtree (reaching `4`).
  - Attach `temp` (subtree `5`) at the end.

  After this step, the entire tree becomes:
  ```
  1
   \
    2
     \
      3
       \
        4
         \
          5
           \
            6
  ```

---

### **Final Flattened Tree**
The tree is now flattened into:
```
1 → 2 → 3 → 4 → 5 → 6
```

---

### **Flow Summary**

1. Start at the root.
2. Recursively flatten the left subtree (`preOrder(node.left)`).
3. Recursively flatten the right subtree (`preOrder(node.right)`).
4. Move the flattened left subtree to the right of the current node.
5. Append the flattened right subtree at the end.

Each node is processed in pre-order fashion, ensuring that all subtrees are flattened correctly.*/