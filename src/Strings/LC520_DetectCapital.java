class LC520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int upperCase = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                upperCase++;
            }
        }
        if(upperCase == n || upperCase == 0 || (upperCase  == 1 && Character.isUpperCase(word.charAt(0))))
        {
            return true;
        }
        return false;
    }
}
