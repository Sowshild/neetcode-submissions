class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int longest=0;
        for(int i=0;i<n;i++){
            int hashFreq[]=new int[26];
            int maxFreq=0;
            for(int j=i;j<n;j++){
                hashFreq[s.charAt(j)-'A']++;
                maxFreq=Math.max(maxFreq,hashFreq[s.charAt(j)-'A']);
                int changes=(j-i+1)-maxFreq;
                if(changes<=k){
                    longest=Math.max(longest, j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return longest;
    }
}
