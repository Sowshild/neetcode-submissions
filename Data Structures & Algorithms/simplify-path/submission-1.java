class Solution {
    public String simplifyPath(String path) {
        String tokens[] = path.split("/");
        Deque<String> st = new ArrayDeque<>();
        for (String i : tokens) {
            if (i.equals("") || i.equals(".")) {
                continue;
            }
            if (i.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } 
            else {
                st.push(i);
            }
        }
        if (st.isEmpty()) {
            return "/";
        }
        String simplified = "";
        while (!st.isEmpty()) {
            simplified = "/" + st.pop() + simplified;
        }
        return simplified;
    }
}