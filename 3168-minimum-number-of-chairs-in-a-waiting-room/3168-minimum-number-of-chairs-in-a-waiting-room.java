class Solution {
    public int minimumChairs(String s) {
        int waitingRoomPeople = 0;
        int max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'E') {
                waitingRoomPeople++;
            } else {
                waitingRoomPeople--;
            }

            if (waitingRoomPeople > max) {
                max = waitingRoomPeople;
            }
        }
        return max;
    }
}