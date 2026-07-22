class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0, r=0, longest=0, maxFreq=0;
        int hashFreq[]=new int[26];
        while(r<n){
            hashFreq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq, hashFreq[s.charAt(r)-'A']);
            if((r-l+1)-maxFreq>k){
                hashFreq[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-maxFreq<=k){
                longest=Math.max(longest, r-l+1);
            }
            r++;
        }
        return longest;
    }
}
