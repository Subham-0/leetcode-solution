class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len = target.length;
        boolean flag = false;
        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {
               
                if (target[i] == arr[j]) {
                    flag = true;
                    arr[j] = 0;
                    break;
                } else {
                    flag = false;
                }
            }
            if(flag== false){
                return flag;
            }
        }
        return flag;
    }
}