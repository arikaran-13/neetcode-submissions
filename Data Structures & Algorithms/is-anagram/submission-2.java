class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())return false;

        var sfq = new HashMap<Character,Integer>();
        var tfq = new HashMap<Character,Integer>();

        for(char ch : s.toCharArray()){
           sfq.put(ch,sfq.getOrDefault(ch,0)+1);
        }
        
        for(char ch : t.toCharArray()){
           tfq.put(ch,tfq.getOrDefault(ch,0)+1);
        }

        for(char ch : s.toCharArray()){
            Integer f1 = sfq.get(ch);
            Integer f2 = tfq.get(ch);

            if(f1==null || f2==null)return false;
            if(!f1.equals(f2))return false;
        }
        return true;

    }
}
