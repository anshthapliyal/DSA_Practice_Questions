class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int l = strs.length;
        String s = "";
        if(l==1)
        {
            s=strs[0];
        }
        else
        {
            s=strs[0];
            for(int i=0; i<(l-1); i++)
            {    
                while(!strs[i+1].startsWith(s))
                {
                    int a = s.length();
                    s=s.substring(0,(a-1));
                    
                }
            }    
        
        }
        return s;
    }
        
}