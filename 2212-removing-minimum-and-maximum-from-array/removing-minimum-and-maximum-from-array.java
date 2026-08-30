class Solution {
    public int minimumDeletions(int[] nums) {
        int i;
        int n= nums.length;
        int min = 0;
int max = 0;


for (i = 1; i < nums.length; i++) {
    if (nums[i] < nums[min]) {
        min = i;
    }

    if (nums[i] > nums[max]) {
        max = i;
    }
}

        
        int removefrontside = Math.max(min,max)+1;
int backside = n- Math.min(min,max);
int removeFromBothSides = Math.min(
            min + 1 + (n - max),
            max + 1 + (n - min)
        );
        return Math.min(removefrontside, Math.min(backside, removeFromBothSides));
       
    }
}