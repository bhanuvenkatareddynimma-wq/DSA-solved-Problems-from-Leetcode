class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       ArrayList<Integer> al=new ArrayList<Integer>();
       Arrays.sort(nums);
       int j=nums[0];
       int i=0;
       while(i<nums.length){
        if(nums[i]==j){
            j++;
            i++;
        }
        else{
            al.add(j);
            j++;
        }

       } 
       return al;
    }
}