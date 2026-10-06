class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var hm = new HashMap<String,List<String>>();

        for(String s : strs){
           var chars = s.toCharArray(); 
           Arrays.sort(chars);
           String key = new String(chars);
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
