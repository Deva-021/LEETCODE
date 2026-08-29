class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       int n = matrix.length*matrix[0].length;
       int arr[] = new int[n];
       int l=0;
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            arr[l++] = matrix[i][j];
        }
       } 
       int m = arr.length;
         for (int i = 0; i < m- 1; i++) {
            for (int j = 0; j < m- 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
       return arr[k-1];
    }
}