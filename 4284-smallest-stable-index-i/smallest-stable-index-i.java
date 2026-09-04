class Solution {
public int firstStableIndex(int[] nums, int k) {
int i = 0;
while (i < nums.length) {
int max = nums[0];
for (int j = 0; j <= i; j++) {
max = Math.max(max, nums[j]);
}
 int min = nums[i];
 for (int j = i; j < nums.length; j++) {
min = Math.min(min, nums[j]);
}
int score = max - min;
if (score <= k) {
 return i;
}
 i++;
}

return -1;
}
}