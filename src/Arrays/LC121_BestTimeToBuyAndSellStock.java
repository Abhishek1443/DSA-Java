package Arrays;

public class LC121_BestTimeToBuyAndSellStock
{
    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int result = 0;
        int currentProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            currentProfit = prices[i] - minPrice;
            if (currentProfit > result) {
                result = currentProfit;
            }
        }

        return result;
    }
    public static void main(String[] args)
    {
        int[] arr = {7,1,5,3,6,4};
        int maxProfit = maxProfit(arr);
        System.out.println("Maximum profit is : "+maxProfit);
    }
}
