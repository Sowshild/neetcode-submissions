class Solution {
    public int splitArray(int[] nums, int k) {
        int l=Arrays.stream(nums).max().getAsInt();
        int r=Arrays.stream(nums).sum();
        int result=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canSplit(nums,mid,k)){
                result=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }
    public boolean canSplit(int nums[], int mid, int k){
        int subArrays=0, currSum=0;
        for(int i: nums){
            currSum+=i;
            if(currSum>mid){
                subArrays+=1;
                currSum=i;
            }
        }
        return subArrays+1<=k;
    }
}