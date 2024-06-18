class Solution {
    public int removeDuplicates(int[] nums) {
        int writer = 0;
        int reader = 1;
        for(; reader<nums.length; reader++){
            if(nums[writer]!=nums[reader]){
                writer ++;
                nums[writer] = nums[reader];
            }
        }
        return writer +1;
    }
}