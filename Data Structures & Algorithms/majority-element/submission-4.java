class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> m=new HashMap<>();
        for(int i: nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: m.entrySet()){
            if(e.getValue()>Math.floor(n/2)){
                return e.getKey();
            }
        }
        return 0;
    }
}