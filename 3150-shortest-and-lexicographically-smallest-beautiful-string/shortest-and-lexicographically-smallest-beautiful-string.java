class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<String> list = new ArrayList<>();
        int i,j;
       for(i=0;i<s.length();i++){
        int count=0;
        for(j=i;j<s.length();j++){
            if(s.charAt(j) == '1'){
                count++;
            }
            if(count==k){
list.add(s.substring(i,j+1));
            }
        }
       } 
       if(list.size()==0){
        return "";
       }
       String min=list.get(0);
       for(i=1;i<list.size();i++){
            if(list.get(i).length()<min.length()){
 min = list.get(i);
            }
              else if(list.get(i).length() == min.length()) {

                if(list.get(i).compareTo(min) < 0) {
                    min = list.get(i);
                }
            }
       }
       return min;
    }
}