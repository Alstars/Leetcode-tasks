package com.example.leetcodetasks.done;

/**
 * Time Complexity O(logn)
 */
public class BinarySearch704 {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while (max - min >= 0) {
            int middle = max + min / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                max = middle - 1;
            } else {
                min = middle + 1;
            }
        }
        return -1;
    }
}
