class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int ans[]=new int[nums.length-k+1];
        int j=0;
        for(int i=0; i<k; i++){
            while(dq.size()>0 && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k; i<nums.length; i++){
             ans[j++]=nums[dq.getFirst()];
             while(dq.size()>0 && dq.getFirst()<=i-k){
                dq.remove();
             }
             while(dq.size()>0 && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
             }
             dq.addLast(i);
        }
        ans[j++]=nums[dq.getFirst()];
        return ans;
    }
}
