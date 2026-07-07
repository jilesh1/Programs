class Solution {
    public long sumAndMultiply(int n) {
        long temp = 0;
        long reverse = 0;
        long sum = 0;

        while (n > 0) {
            int temp1 = n % 10;
            sum += temp1;
            if (temp1 > 0) {
                temp += temp1;
                if (n != 0) {
                    temp *= 10;
                }

            }

            n = n / 10;

        }

        while (temp > 0) {
            long remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        return reverse*sum;

    }
}