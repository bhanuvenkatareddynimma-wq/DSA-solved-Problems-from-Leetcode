class Solution {
    public int findMin(int[] nums) {
        int a=nums[0];
        for(int i=0;i<nums.length;i++){
            if(a>nums[i]){
                a=nums[i];
            }
        }

        return a;
    }
}