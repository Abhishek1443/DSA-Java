public class LC26_RemoveDuplicatesfromSorted
{
    public static int removeDuplicates(int[] nums) {
        int pointIndex = 1;
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            if(nums[i]!=nums[i+1]) {
                nums[pointIndex] = nums[i+1];
                pointIndex++;
            }
        }
        return pointIndex;
    }
}
