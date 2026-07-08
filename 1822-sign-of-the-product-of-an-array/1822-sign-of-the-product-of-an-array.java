class Solution {
    public int arraySign(int[] nums) {
        int prud = 1;

        for (int i = 0; i < nums.length; i++) {
            prud *= nums[i];
            if (prud == 0) {
                return 0;
            }

            if (prud >= 1) {
                prud = 1;
            }
        }

        if (prud >= 1) {
            return 1;
        } else {
            return -1;
        }

    }
}