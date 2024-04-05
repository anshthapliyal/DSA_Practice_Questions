class Solution {
    public int strStr(String haystack, String needle) 
    {
       int hay = haystack.length();
       int need = needle.length();
       int loop = hay-need + 1;
       if(need>hay)
       {
           return -1;
       }
       for(int i=0; i<loop; i++)
       {
            for(int j=0; j<need; j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    break;
                }
                if(j==need-1)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}