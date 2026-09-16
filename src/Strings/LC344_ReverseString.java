class LC344_ReverseString {
    public void reverseString(char[] s) {
        int pointIndex = s.length-1;
        for(int i = 0 ; i < s.length/2 ; i++){
            char temp = s[i];
            s[i] = s[pointIndex];
            s[pointIndex] = temp;
            pointIndex--;
        }
    }
}
