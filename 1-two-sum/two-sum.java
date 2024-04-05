class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;
        for(int i=0; i<n-1; i++)
            for(int j=i+1; j<n; j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    int[] s = {i,j};
                    return s;
                }
            }
        return null; //when no solution is found

    }
}