class Solution {
    public double minimumAverage(int[] nums) {
        double n2=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            double n1=(double)(nums[i]+nums[nums.length-1-i])/2;
            
            if(i==0){
                n2=n1;
            }
            else if(n2>n1){
                n2=n1;

            }
        }
        return n2;
    }
}