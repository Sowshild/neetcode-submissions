class FreqStack {
    int maxFreq;
    Map<Integer, Integer> freqMap;
    Map<Integer, Stack<Integer>> freqStack;
    public FreqStack() {
        maxFreq=0;
        freqMap=new HashMap<>();
        freqStack=new HashMap<>();
    }
    
    public void push(int val) {
        int freq=freqMap.getOrDefault(val,0)+1;
        freqMap.put(val,freq);
        if(freq>maxFreq){
            maxFreq=freq;
        }
        freqStack.computeIfAbsent(freq, f->new Stack()).push(val);
    }
    
    public int pop() {
        Stack<Integer> s= freqStack.get(maxFreq);
        int top=s.pop();
        if(s.isEmpty()){
            maxFreq--;
        }
        freqMap.put(top,freqMap.get(top)-1);
        return top;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */