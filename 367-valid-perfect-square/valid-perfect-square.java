class Solution {
    public boolean isPerfectSquare(int num) {
        boolean a=false;
        for(int i=1;i<=(num/2)+1;i++){
            if(i*i<=num){
                if(num==i*i){
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