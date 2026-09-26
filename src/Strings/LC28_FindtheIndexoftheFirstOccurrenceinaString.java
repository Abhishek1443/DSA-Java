class LC28_FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        for(int i = 0 ; i < haystack.length()-needle.length()+1 ; i++)
        {
            if(haystack.charAt(i) == needle.charAt(0))
            {
                int temp = 1;
                boolean occur = true;
                for(int j = i+1 ; j < i+needle.length() ; j++)
                {
                    if(haystack.charAt(j) == needle.charAt(temp))
                    {
                        temp++;
                        occur = true;
                    }
                    else {
                        occur = false;
                        break;
                    }
                }
                if(occur == true )
                {
                    return i;
                }
            }
        }
        return -1 ;
    }
}
