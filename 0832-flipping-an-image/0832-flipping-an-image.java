class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for(int i=0;i<len;i++){
            int first = 0;
            int last = len-1;
            while(first<last){
                int temp = image[i][first];
                image[i][first] = image[i][last];
                image[i][last] = temp;
                first++;
                last--;
            }
            for(int k = 0;k<len;k++){
                if(image[i][k] == 1){
                    image[i][k] = 0;
                }else{
                    image[i][k] = 1;
                }
            }
        }
        return image;
    }
}