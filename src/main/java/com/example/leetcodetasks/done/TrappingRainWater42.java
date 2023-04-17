package com.example.leetcodetasks.done;

/**
 * Time Complexity O(n)
 * Space complexity O(1)
 */
public class TrappingRainWater42 {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[height.length - 1];
        int totalVolume = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    totalVolume += leftMax - height[left];
                }
            } else {
                right--;
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    totalVolume += rightMax - height[right];
                }
            }
        }
        return totalVolume;
    }
}
