class Solution {
    void subHelper(int[] nums, List<Integer> smallList, List<List<Integer>> finalList, int index){
        finalList.add(new ArrayList(smallList));
        for(int i = index; i<nums.length; i++){
            if(!smallList.contains(nums[i])){
                smallList.add(nums[i]);
                subHelper(nums,smallList,finalList,i);
                //BackTrack (undo)
                smallList.remove(smallList.size()-1);
            }
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        subHelper(nums,smallList, finalList,0);
        return finalList;
        
    }
}