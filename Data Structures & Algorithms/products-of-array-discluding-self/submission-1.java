class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]ans = new int[nums.length];

        int[]prefix = new int[nums.length];
        int[]suffix = new int[nums.length];

        int p=1,s=1;

        for(int i=0;i<nums.length;i++){
            prefix[i]=p;
            p = p*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            suffix[i]=s;
            s=s*nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int prod = prefix[i] * suffix[i];
            ans[i]=prod;
        }
        return ans;
    }
}  
