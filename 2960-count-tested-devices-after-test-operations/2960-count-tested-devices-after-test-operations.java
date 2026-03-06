class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int len = batteryPercentages.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (batteryPercentages[i] > 0) {
                for (int j = i + 1; j < len; j++) {
                    if (batteryPercentages[j] > 0) {
                        batteryPercentages[j]--;
                    }
                }
                count++;
            }
        }
        return count;
    }
}