class LC1929_ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int[] newarr = new int[2*(nums.length)];
        for(int i = 0 ; i < nums.length ; i++)
        {
            newarr[i] = nums[i];
        }
        for(int i = nums.length ; i < newarr.length ; i++)
        {
            newarr[i] = nums[i-nums.length];
        }
        return newarr;
    }
}
