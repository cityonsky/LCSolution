package p1;

import java.util.HashMap;

/**
 * Created by sky on 2016/11/20 0020.
 *
 * https://leetcode.com/problems/two-sum/
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> indices = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            int remain = target - nums[i];
            if (indices.containsKey(remain)) {
                int j = indices.get(remain);
                if (i != j) {
                    int[] result = new int[2];
                    result[0] = j;
                    result[1] = i;
                    return result;
                }
            }
            indices.put(nums[i], i);
        }

        return null;
    }
}
