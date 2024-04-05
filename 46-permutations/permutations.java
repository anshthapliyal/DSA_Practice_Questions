class Solution {
    void permHelper(int[] nums, List<Integer> smallList, List<List<Integer>> finalList){
        //Base Case
        if(nums.length == smallList.size()){
            finalList.add(new ArrayList<Integer>(smallList));
            return;
        }
        for(int i:nums){
            if(!smallList.contains(i)){
                smallList.add(i);
                permHelper(nums,smallList,finalList);
                //BackTrack (undo)
                smallList.remove(smallList.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        permHelper(nums,smallList, finalList);
        return finalList;
    }
}