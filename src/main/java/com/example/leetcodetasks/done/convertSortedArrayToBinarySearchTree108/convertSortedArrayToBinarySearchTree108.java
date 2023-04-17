package com.example.leetcodetasks.done.convertSortedArrayToBinarySearchTree108;

/**
 * Time Complexity O(n)
 * Space complexity O(n)
 */
public class convertSortedArrayToBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return createBST(nums, 0, n - 1);
    }
    public TreeNode createBST(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        if (start > end) return null;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }
}
