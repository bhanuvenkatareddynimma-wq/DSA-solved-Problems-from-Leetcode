class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        for(int i=0;i<k;i++){
            int a=nums[0];
            int t=0;
            for(int j=1;j<nums.length;j++){
                
                if(a>nums[j]){
                    a=nums[j];
                    t=j;
                }
            }
            nums[t]=a*multiplier;
        }
        return nums;
    }
}