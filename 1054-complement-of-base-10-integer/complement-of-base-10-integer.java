class Solution {
    public int bitwiseComplement(int n) {
       String s=Integer.toBinaryString(n);
        s=s.replace("1","2");
        s=s.replace("0","1");
        s=s.replace("2","0");
        int n1=Integer.parseInt(s,2);
        return n1; 
    }
}