class Solution {
    public int scoreOfString(String s) {
        char m;
        int n=0;
        for(int i=0;i<s.length()-1;i++){
            int l=123-(int)s.charAt(i);
            int l1=123-(int)s.charAt(i+1);
            n=n+Math.abs(l-l1);
        }
        return n;   
    }
}