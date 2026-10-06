class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var hm = new HashMap<String,List<String>>();

        for(String s : strs){
            int [] freqArr = new int[26];
           for(int i=0;i<s.length();i++){
                int inx = s.charAt(i) - 'a';
                freqArr[inx]++;
           }
           var key = Arrays.toString(freqArr);
           if(hm.containsKey(key)){
              hm.get(key).add(s);
           }
           else{
            List<String> l = new ArrayList<>();
            l.add(s);
            hm.put(key,l);
           }
        }

        List<List<String>> ans = new ArrayList<List<String>>();
        hm.forEach((k,v)-> ans.add(hm.get(k)));

        return ans;
    }
}
