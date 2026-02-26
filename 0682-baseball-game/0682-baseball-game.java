class Solution {
    public int calPoints(String[] operations) {

        int[] values = new int[operations.length];
        int i = 0;
        for (String s : operations) {
            switch (s) {
                case "C":
                    i--;
                    break;
                case "D":
                    values[i] = values[i - 1] * 2;
                    i++;
                    break;
                case "+":
                    values[i] = values[i - 1] + values[i - 2];
                    i++;
                    break;
                default:
                    values[i] = Integer.valueOf(s);
                    i++;

            }
        }
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += values[j];
        }
        return sum;
    }
}