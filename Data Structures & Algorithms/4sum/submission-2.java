class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int m=k+1;m<n;m++){
                        long sum=(long)nums[i]+nums[j]+nums[k]+nums[m];
                        if(sum==target){
                            List<Integer> l=new ArrayList<>();
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(nums[k]);
                            l.add(nums[m]);
                            Collections.sort(l);
                            s.add(l);
                        }
                    }
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
}