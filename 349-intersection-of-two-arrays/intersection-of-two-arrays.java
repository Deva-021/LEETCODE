class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                set.add(list1.get(i));
            }
        }

        int[] result = new int[set.size()];

        int j = 0;
        for (Integer x : set) {
            result[j++] = x;
        }

        return result;
    }
}