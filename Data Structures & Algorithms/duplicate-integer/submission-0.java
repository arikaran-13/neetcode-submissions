class Solution {
    public boolean hasDuplicate(int[] nums) {
        var hs = new HashSet<Integer>();

        for(int i : nums){
            if(hs.contains(i)){
                return true;
            }
            hs.add(i);
        }
        return false;
    }
}