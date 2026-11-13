class Solution {
    public int alternatingSum(int[] nums) {
        int v=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                v=v+nums[i];
            }
            else{
                v=v-nums[i];
            }
        }
         return v;
    }
}