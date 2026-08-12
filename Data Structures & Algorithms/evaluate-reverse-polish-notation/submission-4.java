class Solution {
    public int evalRPN(String[] tokens) {
        int result=0;
        Deque<Integer> st=new ArrayDeque<>();
        for(String i: tokens){            
            if(i.equals("+")){
                int op1=st.pop();
                int op2=st.pop();
                int sum=op1+op2;
                st.push(sum);
            }
            else if(i.equals("-")){
                int op1=st.pop();
                int op2=st.pop();
                int diff=op2-op1;
                st.push(diff);
            }
            else if(i.equals("*")){
                int op1=st.pop();
                int op2=st.pop();
                int prod=op1*op2;
                st.push(prod);
            }
            else if(i.equals("/")){
                int op1=st.pop();
                int op2=st.pop();
                int div=op2/op1;
                st.push(div);
            }
            else{
                st.push(Integer.parseInt(i));
            } 
        }
        return st.peek();
    }
}
