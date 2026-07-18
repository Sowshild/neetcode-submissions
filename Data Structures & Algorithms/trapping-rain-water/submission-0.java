class Solution {
    public int trap(int[] height) {
        int max=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            int left=0;
            for(int j=0;j<=i;j++){
                left=Math.max(left,height[j]);
            }
            int right=0;
            for(int j=i;j<n;j++){
                right=Math.max(right,height[j]);
            }
                int ans=Math.min(left,right)-height[i];
                max+=ans;
        }
        return max;
    }
}
