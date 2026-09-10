public class LC1_TwoSum
{
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] Out = new int[2];
        for(int i = 0;i < n-1;i++){
            for(int y = i+1;y<n;y++)
                {
                if(nums[i]+nums[y]==target) {
                    Out[0] = i;
                    Out[1] = y;
                    break;
                }
            }
        }
        return Out;
    }
}
