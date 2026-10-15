class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length;
        if(m>n){
            // perform binary search on smaller array
            return findMedianSortedArrays(nums2,nums1);
            // we need to perform binary search only on the first array because it should always be the smaller array, thats why we changed them by calling the function
        }
        int s=m+n;
        int l=0, r=m;
        int left=(m+n+1)/2;
        double median=0;
        while(l<=r){
            int mid1=l+(r-l)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
            if(mid1<m){
                r1=nums1[mid1];
            }
            if(mid2<n){
                r2=nums2[mid2];
            }
            if(mid1-1>=0){
                l1=nums1[mid1-1];
            }
            if(mid2-1>=0){
                l2=nums2[mid2-1];
            }
            if(l1<=r2 && l2<=r1){
                if(s%2==1){
                    median=(double)Math.max(l1,l2);
                }
                else{
                    median=(double)(Math.max(l1,l2)+Math.min(r1,r2))/2;
                }
                break;
            }
            else if(l1>r2){
                r=mid1-1;
            }
            else{
                l=mid1+1;
            }
        }
        return median;
    }
}
