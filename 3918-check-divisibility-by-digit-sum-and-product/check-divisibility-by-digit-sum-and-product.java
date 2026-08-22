class Solution {
    public boolean checkDivisibility(int n) {
        int digit,sum=0,product=1;
        int original = n;
    
       while(n!=0){
        digit = n%10;
        sum += digit;
        product *=digit;
        n=n/10;
       } 
       if(original % (sum+product) == 0)
       return true;
       else
       return false;
    }
}