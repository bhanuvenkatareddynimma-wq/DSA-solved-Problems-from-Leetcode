class Solution {
    public boolean isPowerOfFour(int n) {
        boolean a=false;
        for(int i=0;i<(n/2)+1;i++){
            if(Math.pow(4,i)<=n){
                if(Math.pow(4,i)==n){
                    a=true;
                    break;
                }
            }
            else{
                break;
            }

        }
        return a;
    }
}