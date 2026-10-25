class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int b[]=new int[2];
        int i=0,j=0;
        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                b[j]=nums[i];
                i++;
                j++;
            }
            else{
                i=i+2;
            }
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            b[j]=nums[nums.length-1];
        }
        return b;
    }
}