class LC1365HowManyNumbersAreSmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] alt = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = 0 ; j < nums.length ; j++)
            {
                if(nums[i] > nums[j])
                {
                    alt[i]++;
                }
            }
        }
                    return alt;
    }
}
