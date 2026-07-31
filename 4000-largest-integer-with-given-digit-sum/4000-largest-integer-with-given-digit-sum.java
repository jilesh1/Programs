class Solution {
    public int largestInteger(int n, int s) {

        // Impossible case
        if (s > 9 * n) {
            return -1;
        }

        // Sum 0 means only number is 0
        if (s == 0) {
            return 0;
        }

        StringBuilder ans = new StringBuilder();

        while (n > 0) {
            int digit = Math.min(9, s);
            ans.append(digit);
            s -= digit;
            n--;
        }

        return Integer.parseInt(ans.toString());
    }
}