package Arrays;

public class LC485_MaxConsecutiveOnes
{
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        return maxStreak;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,0,1,1,1};
        int maxStreak = findMaxConsecutiveOnes(arr);
        System.out.println("Maximum number of consecutive 1 is : "+maxStreak);
    }
}
