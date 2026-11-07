class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new LinkedList<>();
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0; i<n; i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e: m.entrySet()){
            if(e.getValue()>Math.floor(n/3)){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}