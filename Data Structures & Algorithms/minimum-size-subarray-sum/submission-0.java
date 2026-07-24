class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum>=target){
                    minlen=Math.min(minlen, j-i+1);
                }
            }
        }
        if(minlen==Integer.MAX_VALUE){
            minlen=0;
        }
        return minlen;
    }
}