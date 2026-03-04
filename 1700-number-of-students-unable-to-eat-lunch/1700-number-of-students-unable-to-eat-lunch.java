class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer, Integer> map = new HashMap<>();
        int studentLen = students.length;
        for (int i = 0; i < studentLen; i++) {
            map.put(students[i], map.getOrDefault(students[i], 0) + 1);
        }
        for (int i = 0; i < studentLen; i++) {
            if (map.getOrDefault(sandwiches[i], 0) > 0) {
                map.put(sandwiches[i], map.get(sandwiches[i]) - 1);
            } else {
                return map.getOrDefault(0, 0) + map.getOrDefault(1, 0);
            }
        }
        return 0;
    }
}