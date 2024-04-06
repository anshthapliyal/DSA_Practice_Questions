class Solution {
    void combSumHelper(int[] candidates, int target, List<Integer> smallList, List<List<Integer>> finalList, int sum, int i){
        //Base Case
        if(i == candidates.length)
        {
            if(sum==target){
                finalList.add(new ArrayList<Integer>(smallList));
            }
            return;
        }
        //Bounding Condition
        if(sum>target){
            return;
        }
        sum = sum+candidates[i];
        smallList.add(candidates[i]);
        combSumHelper(candidates, target, smallList, finalList, sum, i);
        //Backtrack
        sum=sum-candidates[i];
        smallList.remove(smallList.size()-1);
        combSumHelper(candidates, target, smallList, finalList, sum, i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        int sum = 0;
        combSumHelper(candidates, target, smallList, finalList, sum, 0);
        return finalList;
    }
}