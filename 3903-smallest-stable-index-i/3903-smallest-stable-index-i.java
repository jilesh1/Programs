class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min[] = new int[nums.length];
        int max[] = new int[nums.length];
        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;
       

        for (int i = 0; i < nums.length; i++) {
            int num = Math.max(nums[i], max_value);
            max_value = num;
            max[i] = num;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = Math.min(nums[i], min_value);
            min_value = num;
            min[i] = num;
        }
        int n = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max[i] - min[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}