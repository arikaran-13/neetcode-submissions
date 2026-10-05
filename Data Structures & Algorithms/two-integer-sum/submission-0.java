class Solution {
    public int[] twoSum(int[] nums, int target) {
        var hm = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
          int a = nums[i];
          int b = target - a;
          if(hm.containsKey(b)){
            return new int[] {hm.get(b),i};
          }
          hm.put(a,i);
        }
        return new int[]{-1,-1};
    }
}
