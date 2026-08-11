class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = nums[0];
        
        for (int i : nums) {
            set.add(i);
        }
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break; // Stop immediately when the sequential prefix breaks
            }
        }
         while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
  
    
}