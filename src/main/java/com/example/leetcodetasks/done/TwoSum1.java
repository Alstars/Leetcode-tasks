package com.example.leetcodetasks.done;

import java.util.HashMap;

/**
 * Time Complexity O(n)
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 0};
        HashMap<Integer, Integer> isPresent = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (isPresent.containsKey(target - nums[i])) {
                result[0] = isPresent.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            isPresent.put(nums[i], i);

        }
        return result;
    }
}
