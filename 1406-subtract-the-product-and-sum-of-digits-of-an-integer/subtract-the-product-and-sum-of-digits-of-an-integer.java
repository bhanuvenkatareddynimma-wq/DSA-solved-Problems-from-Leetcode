class Solution {
    public int subtractProductAndSum(int n) {
        int a=0,b=0,m=1;
        while(n!=0){
            a=n%10;
            m=m*a;
            b=b+a;
            n=n/10;
        }
        return m-b;
    }
}