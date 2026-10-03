class Solution {
    public void moveZeroes(int[] nums) {
        int j=0,k1=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
             nums[j]=nums[i];
            j++;
            }
            else
            {
                k1++;
            }
        }
        for(int i=1;i<=k1;i++)
        {
            nums[j]=0;
            j++;
        }
        for(int k:nums)
        {
            System.out.print(k+',');
        }
    }
}