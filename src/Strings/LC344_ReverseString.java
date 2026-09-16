class LC344_ReverseString {
    public void reverseString(char[] s) {
        int lastInd = s.length-1;
        for(int i = 0 ; i < s.length/2 ; i++){
            char temp = s[i];
            s[i] = s[lastInd];
            s[lastInd] = temp;
            lastInd--;
        }
    }
}
