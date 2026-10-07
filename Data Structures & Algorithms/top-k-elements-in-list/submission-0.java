class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        var hm = new HashMap<Integer,Integer>();

        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

       var sortedMap= hm.entrySet()
       .stream()
       .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(Collectors.toMap(
            (entry) -> entry.getKey(),
            (entry) -> entry.getValue(),
            (e1,e2) -> e1,
            LinkedHashMap::new
        ));
        int i=0;
        for(Map.Entry<Integer,Integer> entry : sortedMap.entrySet()){
            if(k==0){
                return ans;
            }
            ans[i++] = entry.getKey();
            k--;
        }

        return ans;

        
    }
}
