class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
       Map<Integer, Integer> m=new HashMap<>();
       for(int i=0; i<n; i++){
        if(m.containsKey(target-nums[i])){
            return new int[]{m.get(target-nums[i]), i};
        }
        else{
            m.put(nums[i], i);
        }
       }
       return new int[]{};
    }
}
