class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        int n=0;
        for(int j=0;j<=nums.length;j++){
            if(!al.contains(j)){
                n=j;
            }
        }
        return n;
    }
}