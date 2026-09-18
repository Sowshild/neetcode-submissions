class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int l=1, r=x;
        int res=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(m>x/m){
                r=m-1;
            }
            else if(m<x/m){
                l=m+1;
                res=m;
            }
            else{
                return m;
            }
        }
        return res;
    }
}