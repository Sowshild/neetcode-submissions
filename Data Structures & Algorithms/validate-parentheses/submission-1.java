class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char temp=s.charAt(i);
            if(temp=='(' || temp=='[' || temp=='{'){
                st.push(temp);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.peek();
                if((top=='(' && temp==')') || (top=='[' && temp==']') || (top=='{' && temp=='}')){
                    st.pop();
                }
                else{
                    return  false;
                }
            }
        }
        return st.isEmpty();
    }
}
