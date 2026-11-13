class Solution {
    public int minOperations(int[] nums, int k) {
        int l=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(k>nums[i]){
                l=l+1;
            }
            else{
                break;
            }
        }
        return l;
    }
}