class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
int i;
for(i=0;i<nums.length;i++){
    list.add(nums[i]);
}
for(i=0;i<nums.length;i++){
if(min>nums[i]){
    min=nums[i];
}
if(nums[i]>max){
    max=nums[i];
}
}
for(i=min;i<=max;i++){
    if(list.contains(i)){
        continue;
    }
    else{
       list1.add(i);
    }
    
}
return list1;
    }
}