class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s=nums[0],l=nums[nums.length-1],a=0;
            for(int i=1;i<=s;i++){
                if(l%i==0 && s%i==0){
                    a=i;
                }
            }
            return a;
        }
    }