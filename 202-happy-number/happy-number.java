class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            n=happynum(n);
        }
        if(n==1 || n==7){
            return true;
        }
        else{
            return false;
        }

    }
    public static int happynum(int n){
        int s=0;
        while(n!=0){
            int r=n%10;
            s=s+r*r;
            n=n/10;
        }
        return s;
    }
}