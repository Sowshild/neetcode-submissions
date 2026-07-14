class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int a=0;a<n;a++){
            if(a>0 && nums[a]==nums[a-1]){
                    continue;
                }
            for(int b=a+1;b<n;b++){
                if(b>a+1 && nums[b]==nums[b-1]){
                    continue;
                }
                int c=b+1, d=n-1;
                while(c<d){
                    long sum=(long)nums[a]+nums[b]+nums[c]+nums[d];
                    if(sum<target){
                        c++;
                    }
                    else if(sum>target){
                        d--;
                    }
                    else{
                        List<Integer> l=new ArrayList<>();
                        Collections.addAll(l,nums[a],nums[b],nums[c],nums[d]);
                        ans.add(l);
                        c++;
                        d--;
                        while(c<d && nums[c]==nums[c-1]) c++;
                        while(c<d && nums[d]==nums[d+1]) d--;
                    }
                }
            }
        }
        return ans;
    }
}