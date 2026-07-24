class Solution {
    public int maxDigitRange(int[] nums) {
       
        int max_value=Integer.MIN_VALUE;
        int arr []=new int [nums.length];
        int result=0;
            for(int i=0; i<nums.length; i++){
                int num=nums[i];
                int max_v=Integer.MIN_VALUE;
                int min_v=Integer.MAX_VALUE;
                while(num!=0){
                    int rem=num%10;
                    max_v=Math.max(max_v,rem);
                    min_v=Math.min(min_v,rem);
                    num=num/10;
                }
                
                arr[i]=max_v-min_v;
                max_value=Math.max(arr[i],max_value);
            }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max_value){
                result+=nums[i];
            }
        }
        return result;
    }
}