class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        int l=0, r=0;
        int longest=0;
        int seen[]=new int[256];
        for(int i=0;i<seen.length;i++){
            seen[i]=-1;
        }
        while(r<n){
            if(seen[s.charAt(r)]!=-1){
                if(seen[s.charAt(r)]>=l){
                    l=seen[s.charAt(r)]+1;
                }
            }
            int len=r-l+1;
            longest=Math.max(len,longest);
            seen[s.charAt(r)]=r;
            r++;
        }
        return longest;
    }
}
