class Solution {
    public boolean judgeSquareSum(int c) {

        int result =(int) Math.sqrt(c);
        long left=0;
        long right=result;

       while(left<=right){
        long sum=(left*left)+(right*right);
        if(sum==c){
            return true;
        }else if(sum>c){
            right--;
        }else{
            left++;
        }
       }
        return false;
    }
}