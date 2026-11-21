class Solution {
    public boolean validDigit(int n, int x) {
        boolean a=false;
        String s=Integer.toString(n);
        String c=Integer.toString(x);
        if(s.charAt(0)==c.charAt(0)){
            a=false;
        }
        else if(s.substring(1,s.length()).contains(c) && s.length()>1){
            a=true;

        }
        return a;
    }
}