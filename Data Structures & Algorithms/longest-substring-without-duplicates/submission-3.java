class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        int l=0, longest=0;
        Set<Character> set=new HashSet<>();
        for(int r=0; r<n; r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            longest=Math.max(longest, r-l+1);
        }
        return longest;
    }
}
