public class LC35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        boolean N = true;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == target || nums[i] > target) {
                return i;
            }
            else {
                N = false ;
            }
        }
        if(N==false) {
            return nums.length;
        }
        return -1;
    }
}
