class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        var sFreq = new HashMap<Character,Integer>();
        var tFreq = new HashMap<Character,Integer>(); 

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sFreq.put(ch,sFreq.getOrDefault(ch,0)+1);
        }

         for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            tFreq.put(ch,tFreq.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++){
            var tf = tFreq.get(s.charAt(i));
            var sf = sFreq.get(s.charAt(i));

            if(tf==null||sf==null)return false;
            if(!tf.equals(sf))return false;
        }

        return true;


    }
}
