class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        int i = 0;
        int j = 0;
        List<int[]> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                list.add(new int[] { nums1[i][0], nums1[i][1] + nums2[j][1] });
                i++;
                j++;
            } else if (nums1[i][0] > nums2[j][0]) {
                list.add(nums2[j]);
                j++;
            } else {
                list.add(nums1[i]);
                i++;
            }
        }
        while (i < nums1.length) {
            list.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            list.add(nums2[j]);
            j++;
        }

        return list.toArray(new int[list.size()][]);

        // Map<Integer, Integer> track = new TreeMap<>();
        // for (int i = 0; i < nums1.length; i++) {
        //     track.put(nums1[i][0], track.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        // }
        // for (int i = 0; i < nums2.length; i++) {
        //     track.put(nums2[i][0], track.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        // }
        // int[][] res = new int[track.size()][2];

        // int index = 0;
        // for (Integer key : track.keySet()) {
        //     res[index][0] = key;
        //     res[index][1] = track.get(key);
        //     index++;
        // }

        // return res;
    }
}