class LC1512_NumberofGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodpair = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = i ; j < nums.length-1 ; j++)
            {
                if(nums[i] == nums[j+1])
                {
                    goodpair ++;
                }
            }
        }
        return goodpair ;
    }
}
