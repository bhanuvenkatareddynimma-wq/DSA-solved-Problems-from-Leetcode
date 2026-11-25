class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean a=true;
        String b=Integer.toBinaryString(n);
        if(b.contains("11") || b.contains("00")){
            a=false;
        }
        return a;
    }
}