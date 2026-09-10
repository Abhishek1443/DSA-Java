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
}
