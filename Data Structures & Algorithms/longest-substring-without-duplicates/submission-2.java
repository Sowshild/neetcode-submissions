class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        int longest=0;
        for(int i=0;i<n;i++){
            boolean seen[]=new boolean[256];
            for(int j=i;j<n;j++){
                if(seen[s.charAt(j)]){
                    break;
                }
                else{
                    int len=j-i+1;
                    longest=Math.max(len, longest);
                    seen[s.charAt(j)]=true;
                }
            }
        }
        return longest;
    }
}
