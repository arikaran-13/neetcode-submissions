class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var hm = new HashMap<Integer,Integer>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int[]ans = new int[k];
        List<Integer>[] freq = new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            int freqVal = e.getValue();
            if(freq[freqVal]==null){
                freq[freqVal]=new ArrayList<Integer>();
            }
            freq[freqVal].add(e.getKey());
        }
        int m=0;
        for(int i=freq.length-1;i>=0;i--){
            var al = freq[i];
            if(al==null)continue;
            for(int j=0;j<al.size();j++){
               if(k==0){
                return ans;
               }
               ans[m++]=al.get(j);
               k--;
            }
        }

        return ans;
    }
}
