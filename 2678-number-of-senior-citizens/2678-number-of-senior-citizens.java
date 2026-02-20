class Solution {
    public int countSeniors(String[] details) {
        int c =0;
        for(int i =0;i<details.length;i++){
          String str = details[i];
          if(str.charAt(11)>'6' || str.charAt(11)=='6' && str.charAt(12)>'0'){
            c++;
          }
        }
        return c;
    }
}