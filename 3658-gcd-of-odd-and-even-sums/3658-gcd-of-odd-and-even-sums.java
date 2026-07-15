class Solution {
    public int gcdOfOddEvenSums(int n) {
        int num=n*2;

       int  sum_even=0;
        int sum_odd=0;

        for(int i=0; i<num; i++){
            if(i%2==0){
                sum_even+=i;
            }else{
                sum_odd+=i;
            }
        }
        return Math.abs(sum_even-sum_odd);
    }
}