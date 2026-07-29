class Solution {
    public int differenceOfSums(int n, int m) {
        int num_add=0;
        int num_sub=0;

        for(int i=1; i<=n; i++ ){
            if(i%m!=0){
                num_add+=i;
            }else{
                num_sub+=i;
            }
        }
        return num_add-num_sub;
    }
}