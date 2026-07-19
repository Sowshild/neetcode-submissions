class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int left=0, right=0;
        int ans=0;
        while(l<r){
            left=Math.max(left, height[l]);
            right=Math.max(right, height[r]);
            if(left<right){
                ans+=left-height[l];
                l++;
            }
            else{
                ans+=right-height[r];
                r--;
            }
        }
        return ans;
    }
}
