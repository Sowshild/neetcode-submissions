class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int longest=0;
        int l=0;
        Set<Character> set=new HashSet<>();
        for(int r=0;r<n;r++){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            else{
                longest++;
                set.add(s.charAt(r));
            }
        }
        return longest;
    }
}
