class Solution {
    public int reverseDegree(String s) {
      char m;
        int n=0;
        for(int i=0;i<s.length();i++){
            m=s.charAt(i);
            int l=123-(int)m;
            n=n+(l*(i+1));
        }
        return n;  
    }
}