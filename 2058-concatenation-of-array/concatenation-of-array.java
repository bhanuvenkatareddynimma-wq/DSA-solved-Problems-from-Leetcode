class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int a[]=new int[2*l];
        for(int i=0;i<l;i++){
            a[i]=nums[i];
            a[l+i]=nums[i];
        }
        return a;
    }
}