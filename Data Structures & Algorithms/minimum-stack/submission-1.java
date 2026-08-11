
class MinStack {
    Stack<Long> st;
    long minVal;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            minVal = val;
        } 
        else if (val < minVal) {
            st.push(2L * val - minVal);
            minVal = val;
        } 
        else {
            st.push((long) val);
        }
    }

    public void pop() {
        if (st.peek() < minVal) {
            minVal = 2 * minVal - st.peek();
        }
        st.pop();
    }

    public int top() {
        if (st.peek() < minVal) {
            return (int) minVal;
        } 
        else {
            return st.peek().intValue();
        }
    }

    public int getMin() {
        return (int) minVal;
    }
}
