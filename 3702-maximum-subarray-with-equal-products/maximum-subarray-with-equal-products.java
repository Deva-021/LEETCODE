

class Solution {
    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    static int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }

    public int maxLength(int[] nums) {
        int max=0;

        for(int i=0;i<nums.length;i++){
            int g=nums[i],l=nums[i];
            long p=1;

            for(int j=i;j<nums.length;j++){
                g=gcd(g,nums[j]);
                l=lcm(l,nums[j]);
                p*=nums[j];

                if(p==(long)g*l){
                    max=Math.max(max,j-i+1);
                }
            }
        }

        return max;
    }
}

