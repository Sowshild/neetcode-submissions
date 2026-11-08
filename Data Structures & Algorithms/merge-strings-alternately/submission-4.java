class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length(), n2=word2.length();
        int l=0, r=0;
        StringBuilder merged=new StringBuilder();
        while(l<n1 && r<n2){
            merged.append(word1.charAt(l++));
            merged.append(word2.charAt(r++));
        }
        while(l<n1){
            merged.append(word1.charAt(l++));
        }
        while(r<n2){
            merged.append(word2.charAt(r++));
        }
        return merged.toString();
    }
}