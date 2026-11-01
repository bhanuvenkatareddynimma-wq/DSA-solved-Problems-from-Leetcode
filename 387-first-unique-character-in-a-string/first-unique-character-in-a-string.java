class Solution {
    public int firstUniqChar(String s) {
        int n=-1;
        for(int i=0;i<s.length();i++){
        String sb=s.substring(i+1,s.length())+s.substring(0,i);
        String s1=""+s.charAt(i);
        if(!sb.contains(s1)){
            n=i;
            break;
        }
        }
        return n;
    }
}