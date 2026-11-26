class Solution {
    public boolean canAliceWin(int n) {
        int a=10;
        boolean b=false;
        while(n>=a){
            n=n-a;
            a=a-1;
        }
        if(a%2!=0){
            b=true;
        }
     return b;   
    }
}