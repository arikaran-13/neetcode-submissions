class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb = new StringBuilder();
       for(String s : strs){
         sb.append(s.length());
         sb.append("#");
         sb.append(s);
       }
       return sb.toString();
    }

    public List<String> decode(String str) {
       List<String>ans = new ArrayList<String>();
      int l=0;
      while(l<str.length()){
         int delimiterIndex = str.indexOf("#",l);
         int curStrLen =Integer.parseInt(str.substring(l,delimiterIndex));
         int start=delimiterIndex+1;
         int end = start + curStrLen;
         ans.add(str.substring(start,end));
         l=end;
      }

       return ans;
    }
}
