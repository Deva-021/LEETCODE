class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = new int[m + n];

        int y = 0;  // nums1 pointer
        int z = 0;  // nums2 pointer
        int i = 0;  // nums3 pointer

        // Compare elements from nums1 and nums2
        while (y < m && z < n) {

            if (nums1[y] <= nums2[z]) {
                nums3[i] = nums1[y];
                y++;
            } 
            else {
                nums3[i] = nums2[z];
                z++;
            }

            i++;
        }

        // Copy remaining elements from nums1
        while (y < m) {
            nums3[i] = nums1[y];
            y++;
            i++;
        }

        // Copy remaining elements from nums2
        while (z < n) {
            nums3[i] = nums2[z];
            z++;
            i++;
        }

        // Copy nums3 back into nums1
        for (i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        }
    }
}