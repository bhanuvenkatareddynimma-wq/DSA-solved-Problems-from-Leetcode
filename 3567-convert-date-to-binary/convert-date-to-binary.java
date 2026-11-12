class Solution {
    public String convertDateToBinary(String date) {
        String s[]=date.split("-");
        String sm="";
        for(int i=0;i<s.length;i++){
            int n=Integer.parseInt(String.valueOf(s[i]));
            String bn=Integer.toBinaryString(n);
            if(i>0){
                
                sm=sm+"-";
            }
            
            sm=sm+bn;
        }
        return sm;
    }
}