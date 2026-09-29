class TimeMap {
    Map<String, List<Pair>> m;
    class Pair{
        String value;
        int timestamp;
        Pair(String value, int timestamp){
            this.value=value;
            this.timestamp=timestamp;
        }
    }
    public TimeMap() {
        m=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        m.putIfAbsent(key,new ArrayList<>());
        m.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!m.containsKey(key)){
            return "";
        }
        List<Pair> l=m.get(key);
        int left=0, right=l.size()-1;
        String result="";
        while(left<=right){
            int mid=left+(right-left)/2;
            if(l.get(mid).timestamp<=timestamp){
                result=l.get(mid).value;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */