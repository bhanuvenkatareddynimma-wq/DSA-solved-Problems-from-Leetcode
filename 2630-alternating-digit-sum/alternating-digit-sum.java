class Solution {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);
        int t=0;
        for(int i=0;i<s.length();i++){
            String d=""+s.charAt(i);
            if(i%2==0){
                t=t+Integer.parseInt(d);
            }
            else{
                t=t-Integer.parseInt(d);
            }
        }
        return t;
    }
}