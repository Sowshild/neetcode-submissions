class Solution {
    public int splitArray(int[] nums, int k) {
        int l=Arrays.stream(nums).max().getAsInt();
        int r=Arrays.stream(nums).sum();
        int result=r;
        while(l<=r){
            int m=l+(r-l)/2;
            if(canSplit(nums,m,k)){
                r=m-1;
                result=m;
            }
            else{
                l=m+1;
            }
        }
        return result;
    }
    public boolean canSplit(int nums[], int m, int k){
        int subarrays=0, currSum=0;
        for(int i=0; i<nums.length; i++){
            currSum+=nums[i];
            if(currSum>m){
                subarrays++;
                currSum=nums[i];
            }
        }
        return subarrays+1<=k;
    }
}