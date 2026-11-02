class Solution {
    public int longestConsecutive(int[] nums) {
        var hs = new HashSet<Integer>();
        for(int i : nums){
            hs.add(i);
        }
        int n = nums.length;
        int maxLen=0,len=1;
        for(int i : nums){
            if(hs.contains(i-1)){
                continue;
            }
            while(hs.contains(i)){
                maxLen = Math.max(maxLen,len);//5
                i+=1;//7
                len++;//5
            }
            len=1;
        }
        return maxLen;
    }
}
