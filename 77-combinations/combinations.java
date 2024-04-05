class Solution {
    void combHelper(int n, int k, List<Integer> smallList, List<List<Integer>> finalList, int num){
        //Base Case
        if(smallList.size()==k){
            finalList.add(new ArrayList<Integer>(smallList));
        }
        for(int i=num; i<=n; i++){
            if(!smallList.contains(i))
            {
                smallList.add(i);
                combHelper(n,k,smallList,finalList,i);
                smallList.remove(smallList.size()-1);
            }

        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        combHelper(n,k,smallList,finalList,1);
        return finalList;
        
    }
}