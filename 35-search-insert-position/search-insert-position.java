class Solution {
    public int searchInsert(int[] nums, int target) {
        int m=0;
        if(target>nums[nums.length-1]){
            m=nums.length;
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(target>nums[i]){
                m=m+1;
            }
            }
        }
        return m;
    }
}