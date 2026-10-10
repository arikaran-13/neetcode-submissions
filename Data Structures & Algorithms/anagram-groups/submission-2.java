class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var hm = new HashMap<String,List<String>>();
        List<List<String>> ans = new ArrayList<List<String>>();

        for(String s : strs){
            int[]freq = new int[26];

            for(int i=0;i<s.length();i++){
                 int inx = s.charAt(i) - 'a';
                 freq[inx]++;
            }

            String freqKey = Arrays.toString(freq);
            if(hm.containsKey(freqKey)){
                hm.get(freqKey).add(s);
            }
            else{
                var al = new ArrayList<String>();
                al.add(s);
                hm.put(freqKey,al);
            }
        }

        for(Map.Entry<String,List<String>> entry : hm.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
