class Solution {
    public int countOdds(int low, int high) {
        int c=0,a=0,b=0;
        if(low%2!=0 || high%2!=0){
            c=1;
        }
        a=high-low;
        b=a/2;
        c=c+b;
        
        return c;
    }
}