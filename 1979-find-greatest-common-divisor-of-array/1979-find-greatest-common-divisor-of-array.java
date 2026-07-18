class Solution {
    public int findGCD(int[] nums) {
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;

        for(int i=0; i<nums.length;i++){
            if(nums[i]<small){
                small=nums[i];
            }
            if(nums[i]>=big){
                big=nums[i];
            }
        }
        int count =1;
        for(int i=2; i<=small; i++){
            if(small%i==0 && big%i==0){
               count=i;
            }
        }

        return count;
    }
}