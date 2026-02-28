class Solution {
    public String destCity(List<List<String>> paths) {
        int len = paths.size();
        String destination = paths.get(0).get(1);
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (i != j) {
                    if (destination.equals(paths.get(j).get(0))) {
                        destination = paths.get(j).get(1);
                        break;
                    }
                }
            }
        }
        return destination;
    }
}