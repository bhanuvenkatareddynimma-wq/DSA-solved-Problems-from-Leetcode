class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int b[]=new int[nums.length];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            b[nums[i]-1]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(b[i]==0){
                al.add(i+1);
            }
        }
        return al;
    }
}