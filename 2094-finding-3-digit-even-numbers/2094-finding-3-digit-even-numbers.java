class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int fre[] = new int[10];

        for (int i : digits) {
            fre[i]++;
        }

        for (int i = 1; i <= 9; i++) {

            if (fre[i] == 0) {
                continue;
            }
            fre[i]--;
            for (int j = 0; j <= 9; j++) {
                if (fre[j] == 0) {
                    continue;
                }
                fre[j]--;
                for (int k = 0; k <= 8; k += 2) {
                    if (fre[k] == 0) {
                        continue;
                    }
                    fre[k]--;
                    int num = i * 100 + j * 10 + k;
                    list.add(num);
                    fre[k]++;
                }
                fre[j]++;
            }
            fre[i]++;
        }
        Collections.sort(list);
        int[] resArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resArr[i] = list.get(i);
        }

        return resArr;
    }
}