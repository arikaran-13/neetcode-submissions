class Solution {
    public boolean isPalindrome(String s) {
        int l =0;
        int r = s.length()-1;

        while(l<=r){
            char firstCh = s.charAt(l);
            char lastCh =s.charAt(r);

            if(!Character.isLetterOrDigit(firstCh)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(lastCh)){
                r--;
                continue;
            }

            firstCh = Character.toLowerCase(firstCh);
            lastCh = Character.toLowerCase(lastCh);

            if(firstCh != lastCh)return false;
            l++;
            r--;
        }
        return true;
    }
}
