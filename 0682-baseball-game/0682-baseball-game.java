class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("C")) {
                list.remove(list.size() - 1);
            } else if (op.equals("D")) {
                list.add(list.get(list.size() - 1) * 2);
            } else if (op.equals("+")) {
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            } else {
                list.add(Integer.valueOf(op));
            }
        }
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}