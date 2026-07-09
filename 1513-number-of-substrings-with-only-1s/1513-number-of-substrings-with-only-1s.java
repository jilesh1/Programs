class Solution {
    public int numSub(String s) {
        int mod = 1000000007;
        long sum = 0;

        long temp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '1') {
                temp++;
            } else {
                long add = (temp * (temp + 1)) / 2;
                add = add % mod;
                sum = (sum + add) % mod;
                temp = 0;
            }

        }
        long add = (temp * (temp + 1)) / 2;
        add = add % mod;
        sum = (sum + add) % mod;
        return (int) sum;
    }
}