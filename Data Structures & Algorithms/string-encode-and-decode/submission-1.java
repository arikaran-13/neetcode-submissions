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
    
    //"5#hello5#world"
    public List<String> decode(String str) {
       var ans = new ArrayList<String>();
       
       int l=0;
       while(l<str.length()){
         int delimiterIndex = str.indexOf("#",l);//1
         
         int substrLen = Integer.valueOf(str.substring(l,delimiterIndex));//5
         int start = delimiterIndex+1;
         int end = start + substrLen;
         ans.add(str.substring(start,end));//

         l=end;

       }

       return ans;
    }
}
