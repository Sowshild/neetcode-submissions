class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l=new ArrayList<>();
        for(int i: arr){
            l.add(i);
        }
        l.sort((a,b)->{
            int diff=Math.abs(a-x)-Math.abs(b-x);
            return diff==0?Integer.compare(a,b):diff;
        });
        List<Integer> ans=l.subList(0,k);
        Collections.sort(ans);
        return ans;
    }
}