class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> al=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            
            al.add(nums[i]);
            
        }
        for(int i=0;i<nums.length;i++){
            StringBuffer ab=new StringBuffer(Integer.toString(nums[i]));
            int n=Integer.parseInt(String.valueOf(ab.reverse()));
            
                al.add(n);
            
        }
        return al.size();
    }
}