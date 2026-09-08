package Arrays;

public class LC283_MoveZeroes
{
    public static void moveZeroes(int[] nums)
    {
        int pI = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[pI];
                nums[pI] = temp ;
                pI++;
            }
        }
        System.out.print("The updated array is : ");
        for(int value : nums)
            System.out.print(value+" ");

    }
    public static void main(String[] args)
    {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
