class Solution {
    public int heightChecker(int[] heights) {
        List<Integer> unsort = new ArrayList();
        for(int i : heights){
            unsort.add(i);
        }
        Arrays.sort(heights);
        int c = 0;
        for(int i =0;i<heights.length;i++){
            if(unsort.get(i)!= heights[i]){
                c++;
            }
        }
        return c;
    }
}