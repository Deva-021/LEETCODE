class Solution {
  public int reverseBits(int n) {
    String binary = Integer.toBinaryString(n);

    StringBuilder sb = new StringBuilder(binary);

    while (sb.length() < 32) {
        sb.insert(0, '0');
    }

    sb.reverse();

    return (int) Long.parseLong(sb.toString(), 2);
}
}