class LC1431_KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> result = new ArrayList<>();
        for(int i = 1 ; i < candies.length ; i ++)
        {
            if(max < candies[i])
            {
                max = candies[i];
            }
        }
        for(int i = 0 ; i < candies.length ; i++)
        {
            candies[i]+=extraCandies;
            if(candies[i]>=max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}
