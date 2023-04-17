package com.example.leetcodetasks.done.ValidateBinarySearchTree98;

/**
 * Time complexity O(n) worst-case
 * Space complexity O(1)
 */
public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val >= max || root.val <= min) {
            return false;
        } else {
            return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
        }
    }
}
