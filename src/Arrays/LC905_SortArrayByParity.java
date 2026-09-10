public class LC905_SortArrayByParity
{
    public static int[] sortArrayByParity(int[] nums)
    {
        int pointIndex = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]%2==0)
            {
                int temp = nums[i];
                nums[i] = nums[pointIndex];
                nums[pointIndex] = temp;
                pointIndex++;
            }
        }
        return nums;
    }
}
