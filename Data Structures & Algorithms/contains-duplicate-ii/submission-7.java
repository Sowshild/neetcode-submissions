class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        Set<Integer> s=new HashSet<>();
        for(int r=0;r<n;r++){
            if(r-l>k){
                s.remove(nums[l]);
                l++;
            }
            if(s.contains(nums[r])){
                return true;
            }
            s.add(nums[r]);
        }
        return false;
    }
}