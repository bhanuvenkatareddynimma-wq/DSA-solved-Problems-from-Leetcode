class Solution {
    public int countDigits(int num) {
        int r,c=0;
        int n=num;
        while(n!=0){
            r=n%10;
            if(num%r==0){
                c=c+1;
            }
            n=n/10;
        }
        return c;
    }
}