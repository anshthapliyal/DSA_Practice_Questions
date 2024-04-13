class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();

        //int n=digits.length();
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> finalList=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        letCombHelper(sb,map,digits, finalList);
        return finalList;
    }

    public void letCombHelper(StringBuilder sb, Map<Character,String> map, String digits, List<String> finalList){
        //base case
        if(digits.length()==0){
            finalList.add(sb.toString());
            return;
        }
        String str=map.get(digits.charAt(0));
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            letCombHelper(sb, map, digits.substring(1),finalList);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}