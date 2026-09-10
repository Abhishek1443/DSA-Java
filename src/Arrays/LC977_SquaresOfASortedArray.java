public class LC977_SquaresOfASortedArray
{
    public static int[] sortedSquares(int[] nums)
    {
        int[] newarr = new int[nums.length];
        int sI = 0;
        int eI = nums.length-1;
        int pI = nums.length-1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = nums[i]*nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[sI] < nums[eI])
            {
                newarr[pI] = nums[eI] ;
                eI--;
            }

            else if(nums[sI] >= nums[eI])
            {
                newarr[pI] = nums[sI] ;
                sI++;
            }
            else if(eI == sI)
            {
                newarr[pI] = nums[sI];
            }
            pI--;
        }
        return newarr ;
    }
}
