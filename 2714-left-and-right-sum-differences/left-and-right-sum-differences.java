class Solution {
    public int[] leftRightDifference(int[] nums) {
               int s=0,n=0;
        int answer[]=new int[nums.length];
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            s=s+nums[i];
            l[j]=s;
            n=n+nums[nums.length-1-i];
            r[j]=n;
            j++;
        }
        for(int i=0;i<nums.length;i++){
            answer[i]=Math.abs(l[i]-r[nums.length-i-1]);
        }  
        return answer;
    }
}