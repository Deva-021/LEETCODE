class Solution {
public int lengthOfLastWord(String s) {
String[] arr = s.trim().split("\\s+");
if (arr.length == 0 || arr[0].equals("")) {
 return 0;
}
String a=arr[arr.length-1];
return a.length();
}
}