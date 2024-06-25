class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Double.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum = sum+ nums[i];
        }
        avg = 1.0 * sum/k;
        for(int i = k; i<nums.length; i++){
            sum = sum-nums[i-k]+nums[i];
            avg = Math.max(avg, 1.0 * sum/k);
        }
       
        return avg;
    }
}