  public class Solution {

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
      var decodedStrs = new ArrayList<String>();
      int start =0;
      int end=0;
      while(start<str.length()){
        var delimiterIndex = str.indexOf("#",start);
        int curLen = Integer.parseInt(str.substring(start,delimiterIndex));
        start = delimiterIndex+1;
        end = start + curLen;
        String curStr = str.substring(start,end);
        decodedStrs.add(curStr);
        start = start+curLen;
    }
      return decodedStrs;
      
    }
}