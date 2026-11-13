class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int s=0;
       // Arrays.sort(hours);
        for(int i=hours.length-1;i>=0;i--){
            if(hours[i]>=target){
                s++;
            }
           /* else{
                break;
            }*/
        }
        return s;
    }
}