class Solution {
    public int fib(int n) {
        int x1=0,x2=1,x3,m=0;
        if(n==1){
            m=x2;
        }
        else if(n==2){
            m=x1+x2;
        }
        else{
            x3=x1+x2;
            for(int i=3;i<=n;i++){
                
                x1=x2;
                x2=x3;
                x3=x1+x2;
                m=x3;

            }
         }
        

        return m;
    }
}