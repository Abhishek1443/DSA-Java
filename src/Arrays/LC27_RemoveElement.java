public class LC27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int pointIndex = 0;
        for(int i = 0 ; i<nums.length ; i++) {
            if(nums[i] != val) {
                nums[pointIndex] = nums[i];
                pointIndex++;
            }
        }
        return pointIndex;
    }
}
