class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find maximum frequency
        int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Sum frequencies equal to max frequency
        int ans = 0;
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                ans += freq;
            }
        }

        return ans;
    }
}