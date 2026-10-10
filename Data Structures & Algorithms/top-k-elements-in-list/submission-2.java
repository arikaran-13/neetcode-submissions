class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var hm = new HashMap<Integer,Integer>();
        int[]ans = new int[k];
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
       var sortedMap= hm.entrySet()
         .stream()
         .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
         .collect(Collectors.toMap(
             (entry) -> entry.getKey(),
             (entry) -> entry.getValue(),
             (e1,e2)->e1,
             LinkedHashMap::new
        ));
        int i=0;
        for(Map.Entry<Integer,Integer> e : sortedMap.entrySet()){
            if(k==0){
                return ans;
            }
            ans[i++]=e.getKey();
            k--;
        }
        return ans;
    }
}
