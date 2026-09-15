class LC268_MissingNumber {
    public int missingNumber(int[] nums) {
        int x ; 
        int n = nums.length;
        int sum = 0; 
        for(int i = 0 ; i < nums.length ; i++) {
            sum = nums[i] + sum;
        }
        x = n*(n+1)/2 - sum  ; 
        return x;
    }
}
