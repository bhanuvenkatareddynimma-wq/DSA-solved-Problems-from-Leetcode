class Solution {
    public int gcdOfOddEvenSums(int n) {
        int od=n*n;
        int ev=od+n;
        int k=0;
        for(int i=od;i>=1;i--){
            if(od%i==0 && ev%i==0){
                k=i;
                break;
            }
        }
        return k;
    }
}