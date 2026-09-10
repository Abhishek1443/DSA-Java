class LC88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < n ; i++) {
            nums1[m+i] = nums2[i];
        }
        for(int i = 0; i<nums1.length-1 ; i++) {
            for(int y = i+1 ; y > 0 ; y--) {
                if(nums1[y] < nums1[y-1]) {
                    int temp = nums1[y];
                    nums1[y] = nums1[y-1];
                    nums1[y-1] = temp;
                }
            }

        }
    }
}
