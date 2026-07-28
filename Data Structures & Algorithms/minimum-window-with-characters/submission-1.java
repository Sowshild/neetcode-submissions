class Solution {
    public String minWindow(String s, String t) {
        int l=0, r=0, count=0, minlen=Integer.MAX_VALUE, start=-1, n=s.length(), m=t.length();
        int hash[]=new int[256];
        for(int i=0; i<m; i++){
            hash[t.charAt(i)]++;
        }
        while(r<n){
            if(hash[s.charAt(r)]>0){
                count++;
            }
            hash[s.charAt(r)]--;
            while(count==m){
                if(r-l+1 < minlen){
                    minlen=r-l+1;
                    start=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return start==-1?"":s.substring(start, start+minlen);
    }
}
