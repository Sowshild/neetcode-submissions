class Solution {
    public int splitArray(int[] nums, int k) {
        int l=Arrays.stream(nums).max().getAsInt();
        int r=Arrays.stream(nums).sum();
        int result=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(split(nums,mid,k)){
                result=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }
    public boolean split(int nums[],int mid, int k){
        int subarrays=0;
        int currsum=0;
        for(int i=0; i<nums.length; i++){
            currsum+=nums[i];
            if(currsum>mid){
                subarrays+=1;
                currsum=nums[i];
            }
        }
        return subarrays+1<=k;
    }
}