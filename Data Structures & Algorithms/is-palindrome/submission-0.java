class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            var ch = s.charAt(i);

            if( (ch >= 'a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') ){
                sb.append(Character.toLowerCase(ch));
            }
        }

        StringBuilder sb2 = new StringBuilder(sb).reverse();
         return sb.toString().equals(sb2.toString());

        
    }
}
