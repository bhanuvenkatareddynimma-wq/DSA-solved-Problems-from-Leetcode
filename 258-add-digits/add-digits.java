class Solution {
    public int addDigits(int num) {

        while(num>9){
            num=suchm(num);
            
        }
        return num;
    }
        static int suchm(int num){
        int s=0;
            while(num!=0){
            int r=num%10;
            s=s+r;
            num=num/10;  
            }
        return s;
        
        }
}