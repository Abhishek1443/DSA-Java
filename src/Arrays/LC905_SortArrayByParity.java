package Arrays;

import javax.print.DocFlavor;

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
    public static void main(String[] args)
    {
        int[] arr = {3,1,2,4,7,6};
        arr = sortArrayByParity(arr);
        for(int value : arr)
            System.out.print(value+" ");
    }
}
