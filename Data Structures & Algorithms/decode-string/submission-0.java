class Solution {
    public String decodeString(String s) {
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=']'){
                st.push(s.charAt(i));
            }
            else{
                StringBuilder sub=new StringBuilder();
                while(st.peek()!=('[')){
                    sub.insert(0,st.pop());
                }
                st.pop();
                StringBuilder k=new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    k.insert(0,st.pop());
                }
                int count=Integer.parseInt(k.toString());
                String repStr=sub.toString().repeat(count);
                for(int j=0; j<repStr.length(); j++){
                    st.push(repStr.charAt(j));
                }
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.insert(0,st.pop());
        }
        return res.toString();
    }
}