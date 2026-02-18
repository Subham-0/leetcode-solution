class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap();
        for (int i = 0; i < rings.length(); i += 2) {
            map.putIfAbsent(rings.charAt(i + 1), new HashSet<>());
            map.get(rings.charAt(i + 1)).add(rings.charAt(i));
        }
        int c = 0;
        for (Set<Character> set : map.values()) {
            if (set.size() == 3) {
                c++;
            }
        }
        return c;
    }
}