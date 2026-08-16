class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        if (nums[0] != 0)
            return 0;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                continue;
            } else {
                return nums[i] - 1;
            }
        }

        return nums[n - 1] + 1;
    }
}