class Solution {
    public String destCity(List<List<String>> paths) {

        Set<String> startingCities = new HashSet<String>();

        for (List<String> s : paths) {
            startingCities.add(s.get(0));
        }

        for (List<String> s : paths) {
            String destination = s.get(1);
            if (!startingCities.contains(destination)) {
                return destination;
            }
        }
        return "";

    }
}