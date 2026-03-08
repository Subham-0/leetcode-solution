class Solution {
    public int appendCharacters(String s, String t) {
         int i = 0;
        int j = 0;
        int tLen = t.length();
        int sLen = s.length();
        while(i<sLen && j<tLen){
            if(t.charAt(j)==s.charAt(i)){
                j++;
            }
            i++;
        }
        return tLen-j;
    }
}