class Solution {
    public int countPoints(String rings) {
        Map<Character, String> map = new HashMap();
        for (int i = 0; i < rings.length(); i += 2) {
            map.put(rings.charAt(i + 1), map.getOrDefault(rings.charAt(i + 1), "") + rings.charAt(i));
        }
        int c = 0;
        for (String val : map.values()) {
            if (val.contains("R") && val.contains("G") && val.contains("B")) {
                c++;
            }
        }
        return c;
    }
}