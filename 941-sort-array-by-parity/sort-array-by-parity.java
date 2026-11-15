class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int b[]=new int[nums.length];
        ArrayList<Integer> al=new ArrayList<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                b[j]=nums[i];
                j++;
            }
            else{
                al.add(nums[i]);
            }

        }
        
        for(int i=0;i<al.size();i++){
            b[j]=al.get(i);
            j++;
        }
        return b;
    }
}