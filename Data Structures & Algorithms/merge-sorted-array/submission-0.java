class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int temp[]=new int[m+n];
       int i=0,j=0,k=0;
       while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            temp[k++]=nums1[i];
            i++;
        }
        else{
            temp[k++]=nums2[j];
            j++;
        }
       }
       while(j<n){
        temp[k++]=nums2[j];
        j++;
       }
       while(i<m){
        temp[k++]=nums1[i];
        i++;
       }
       for(int p=0;p<(m+n);p++){
        nums1[p]=temp[p];
       }
    }
}