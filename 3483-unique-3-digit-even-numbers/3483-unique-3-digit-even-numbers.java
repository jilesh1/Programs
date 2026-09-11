class Solution {
    public int totalNumbers(int[] digits) {

        int fre[] = new int[10];
        HashSet<Integer> set = new HashSet<>();

        for (int i : digits) {
            fre[i]++;
        }

        for (int i = 1; i <= 9; i++) {
            if (fre[i] == 0)
                continue;

            fre[i]--;

            for (int j = 0; j <= 9; j++) {
                if (fre[j] == 0)
                    continue;

                fre[j]--;

                for (int k = 0; k <= 8; k+=2) {
                    if (fre[k] == 0)
                        continue;

                    fre[k]--;

                    int num = i * 100 + j * 10 + k;
                    set.add(num);

                    fre[k]++;
                }

                fre[j]++;
            }

            fre[i]++;
        }

        return set.size();
    }
}