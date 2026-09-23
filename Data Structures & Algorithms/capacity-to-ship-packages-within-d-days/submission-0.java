class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low=Arrays.stream(weights).max().getAsInt();
       int high=Arrays.stream(weights).sum();
       while(low<=high){
        int m=low+(high-low)/2;
        int daysRequired=daysRequired(weights,m);
        if(daysRequired<=days){
            high=m-1;
        }
        else{
            low=m+1;
        }
       }
       return low;
    }
    public int daysRequired(int weights[], int capacity){
        int days=1, load=0;
        for(int i=0; i<weights.length; i++){
            if(load+weights[i]>capacity){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }        
        }
        return days;
    }
}