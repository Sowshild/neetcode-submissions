class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length(), m=t.length();
        if(n!=m){
            return false;
        }
        int freq[]=new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
