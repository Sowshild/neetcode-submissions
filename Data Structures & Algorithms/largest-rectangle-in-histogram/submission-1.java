class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int right[]=new int[n];
        int left[]=new int[n];
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=n-1; i>=0; i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
         for(int i=0; i<n; i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        int maxArea=0;
        for(int i=0; i<n; i++){
            int currArea=heights[i]*(right[i]-left[i]-1);
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;
    }
}
