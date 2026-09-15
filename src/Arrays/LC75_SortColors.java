class LC75_SortColors {
    public void sortColors(int[] nums) {
        int redNum = 0 , whiteNum = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]==0)
            {
                redNum++;
            }
            if(nums[i]==1)
            {
                whiteNum++;
            }
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(i < redNum)
            {
                nums[i] = 0;
                }
            else if(i >= redNum && i < redNum+whiteNum)
            {
                nums[i] = 1;
            }
            else 
            {
                nums[i]=2;
            }
        }
    }
}
