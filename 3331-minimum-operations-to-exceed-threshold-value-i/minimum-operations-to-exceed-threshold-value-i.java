class Solution {
    public int minOperations(int[] nums, int k) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(k>nums[i]){
                l=l+1;
            }
        }
        return l;
    }
}