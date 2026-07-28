class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        int minlen=Integer.MAX_VALUE;
        int start=-1;
        for(int i=0; i<n; i++){
            int hash[]=new int[256];
            int count=0;
            for(int j=0; j<m; j++){
                hash[t.charAt(j)]++;
            }
            for(int j=i; j<n; j++){
                if(hash[s.charAt(j)]>0){
                    count+=1;
                }
                hash[s.charAt(j)]--;
                if(count==m){
                    if((j-i+1)<minlen){
                        minlen=j-i+1;
                        start=i;
                        break;
                    }
                }
            }
        }
        if(start==-1){
            return "";
        }
        return s.substring(start,start+minlen);
    }
}
