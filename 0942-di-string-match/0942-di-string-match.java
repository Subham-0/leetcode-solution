class Solution {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int[] arr = new int[len + 1];
        int m = 0;
        int n = len;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='I'){
                arr[i] = m++;
            }else{
                arr[i] = n--;
            }
        }
        arr[len] = m;
        return arr;
    }
}