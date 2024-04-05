/*Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
You may return the answer in any order.
    
Example 1:

Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
Example 2:

Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.*/

//Driver Code
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
