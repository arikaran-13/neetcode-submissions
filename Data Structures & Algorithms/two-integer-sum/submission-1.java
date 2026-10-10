class Solution {
    public int[] twoSum(int[] nums, int target) {
        var hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
           int elem = target-nums[i];
           if(hm.containsKey(elem)){
            return new int []{hm.get(elem),i};
           }
           hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
