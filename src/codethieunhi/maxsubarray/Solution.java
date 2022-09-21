package codethieunhi.maxsubarray;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            tmp += nums[i];
            if (tmp > max) max = tmp;
            if (tmp < 0) tmp = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
