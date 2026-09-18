class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
       HashMap<Character, Character> map = new HashMap<>();
       for(int i=0;i<arr1.length;i++){
      char key = arr1[i];
    char value = arr2[i];

    if (map.containsKey(key)) {
        if (map.get(key) != value) {
            return false;
        }
    } else {
        // key doesn't exist
        if (map.containsValue(value)) {
            return false;
        }

        map.put(key, value);
    }
}
return true;
    
    }
}