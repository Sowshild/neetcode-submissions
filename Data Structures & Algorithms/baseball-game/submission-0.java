class Solution {
    public int calPoints(String[] operations) {
        int scoresum=0;
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0; i<operations.length; i++){
            String temp=operations[i];
           if(temp.equals("D")){
            st.push(2*st.peek());
           }
           else if(temp.equals("C")){
            st.pop();
           }
           else if(temp.equals("+")){    
                int t1=st.pop();
                int t2=st.pop();
                int sum=t1+t2;
                st.push(t2);
                st.push(t1);
                st.push(sum);              
           }
           else{
            st.push(Integer.parseInt(temp));
           }
        }
        while(st.size()>0){
            scoresum+=st.pop();
        }
        return scoresum;
    }
}