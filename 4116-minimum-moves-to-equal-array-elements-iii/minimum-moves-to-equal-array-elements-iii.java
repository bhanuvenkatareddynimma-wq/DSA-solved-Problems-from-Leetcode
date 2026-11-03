class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int k=nums[nums.length-1];
        int m=0;
        for(int i=0;i<nums.length-1;i++){
            if(k>nums[i]){
                m=m+(k-nums[i]);
            }
        }
        return m;
    }
}