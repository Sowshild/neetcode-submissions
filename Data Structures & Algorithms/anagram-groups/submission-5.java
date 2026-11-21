class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> m=new HashMap<>();
        for(String i: strs){
            char temp[]=i.toCharArray();
            Arrays.sort(temp);
            String k=String.valueOf(temp);
            m.putIfAbsent(k,new ArrayList<>());
            m.get(k).add(i);
        }
        return new ArrayList<>(m.values());
    }
}
