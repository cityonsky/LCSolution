package p1;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testTwoSum() throws Exception {
        int[] nums = new int[] {2, 7, 11, 15};
        int[] results = new Solution().twoSum(nums, 9);
        Assert.assertArrayEquals(new int[] {0, 1}, results);

        nums = new int[] {-3, 4, 3, 90};
        results = new Solution().twoSum(nums, 0);
        Assert.assertArrayEquals(new int[] {0, 2}, results);
    }
}