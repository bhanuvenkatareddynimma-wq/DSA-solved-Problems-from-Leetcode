class Solution {
    public boolean isPowerOfThree(int n) {
         boolean a=false;
        if(n==1 || n==3){
            a=true;
        }
        else if(n>1){
            for(int i=1;i<n/2;i++){
                if(Math.pow(3,i)<=n){
                    if(n==Math.pow(3,i)){
                        a=true;
                        break;
                    }
                }
                else{
                    break;
                }

            }
        }
        return a;
    }
}