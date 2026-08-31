class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,u=numbers.length-1,i;
        ArrayList<Integer> list = new ArrayList<>();
        for(i=0;i<numbers.length;i++){
            if(target==numbers[l]+numbers[u]){
                list.add(l+1);
                list.add(u+1);
                break;
            }
            else if(target<numbers[l]+numbers[u]){
           u--;
        }
        else{
            l++;
        }
        }
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

return result;
    }
}