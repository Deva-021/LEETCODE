class Solution {
    public int missingMultiple(int[] nums, int k) {

        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Add all elements to TreeSet
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // Store only multiples of k
        for (int x : set) {
            if (x % k == 0) {
                list.add(x);
            }
        }

        // Base condition: no multiple of k exists
        if (list.isEmpty()) {
            return k;
        }

        // First multiple is missing
        if (list.get(0) != k) {
            return k;
        }

        // Check for a missing multiple in between
        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i + 1) - list.get(i) != k) {
                return list.get(i) + k;
            }
        }

        // Missing multiple is after the last element
        return list.get(list.size() - 1) + k;
    }
}