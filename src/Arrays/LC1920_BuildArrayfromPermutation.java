class LC1920_BuildArrayfromPermutation {
    public int[] buildArray(int[] nums) 
    {
        int temp;
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
        {
            temp = nums[i];
            ans[i] = nums[temp];
        }
        return ans ;
    }
}
