class LC58_LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int countLength = 0;
        while(s.charAt(i) == ' ')
        {
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' ')
        {
            countLength++;
            i--;
        }
        return countLength;
    }
}
