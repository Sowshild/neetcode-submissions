/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        // Find peak element
        int l=1, r=n-2; //peak can't be at edges, so we've done a small optmization
        int peak=0;
        while(l<=r){
            int m=l+(r-l)/2;
            int left=mountainArr.get(m-1), mid=mountainArr.get(m), right=mountainArr.get(m+1);
            if(left<mid && mid<right){
                l=m+1;
            }
            else if(left>mid && mid>right){
                r=m-1;
            }
            else{
                peak=m;
                break;
            }
        }
        // search in left portion
        l=0; r=peak;
        while(l<=r){
            int m1=l+(r-l)/2;
            int val=mountainArr.get(m1);
            if(val>target){
                r=m1-1;
            }
            else if(val<target){
                l=m1+1;
            }
            else{
                return m1;
            }
        }
        // Search in right portion
        l=peak; r=n-1;
        while(l<=r){
            int m2=l+(r-l)/2;
            int val=mountainArr.get(m2);
            if(val>target){
                l=m2+1;
            }
            else if(val<target){
                r=m2-1;
            }
            else{
                return m2;
            }
        }
        return -1;
    }
}