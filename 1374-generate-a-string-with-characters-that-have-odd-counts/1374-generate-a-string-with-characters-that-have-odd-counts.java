class Solution {
    public String generateTheString(int n) {
        StringBuilder str = new StringBuilder();
        if(n%2==1){
            for(int i=0;i<n;i++){
                str.append("a");
            }
        }
        else{
            for(int i=0;i<n-1;i++){
                str.append("a");
            } 
            str.append("b");
        }
        return new String(str);
    }
}