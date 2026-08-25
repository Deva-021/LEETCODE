class Solution {
    public int missingMultiple(int[] nums, int k) {

        Set<Integer> hash = new HashSet<>();

       for (int i = 0; i < nums.length; i++) {
    hash.add(nums[i]);
}

        int multiple = k;

        while(hash.contains(multiple)) {

            multiple = multiple + k;

        }

        return multiple;
    }
}