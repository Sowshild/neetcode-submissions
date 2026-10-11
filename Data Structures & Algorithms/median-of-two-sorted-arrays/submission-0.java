class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length;
        int s=m+n;
        int arr[]=new int[s];
        for(int i=0; i<m; i++){
            arr[i]=nums1[i];
        }
        for(int i=0; i<n; i++){
            arr[m+i]=nums2[i];
        }
        double median=0;
        Arrays.sort(arr);
        if(s%2==0){
            int m1=arr[(s/2)-1];
            int m2=arr[(s/2)];
            median=(double)(m1+m2)/2;
        }
        else{
            int mid=(s+1)/2;
            median=(double)arr[mid-1];
        }
        return median;
    }
}
