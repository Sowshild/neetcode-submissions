class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length(),n2=word2.length();
        StringBuilder merged=new StringBuilder();
        int i=0,j=0;
        while(i<n1 && j<n2){
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }
            while(i<n1){
                merged.append(word1.charAt(i++));
            }
            while(j<n2){
                merged.append(word2.charAt(j++));
            }
        return merged.toString();
    }
}