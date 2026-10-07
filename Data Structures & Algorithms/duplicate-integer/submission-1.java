class Solution {
    public boolean hasDuplicate(int[] nums) {
        var hs = new HashSet<Integer>();

        for(int num : nums){
            if(hs.contains(num))return true;
            hs.add(num);
        }

        return false;
    }
}