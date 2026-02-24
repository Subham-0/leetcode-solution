class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean f = true;
            while (num != 0) {
                int rem = num % 10;
                num /= 10;
                if (rem == 0 || i % rem != 0) {
                    f = false;
                    break;
                }

            }
            if (f) {
                list.add(i);
            }
        }

        return list;
    }
}