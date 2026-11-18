class Solution {
    public String firstPalindrome(String[] words) {
         String s="";
        for(int i=0;i<words.length;i++){
            StringBuffer sb=new StringBuffer(words[i]);
            String ss=""+sb.reverse();
            if(words[i].equals(ss)){
                s=s+words[i];
                break;
                
            }
        }
        return s;
    }
}