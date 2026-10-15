class Solution {
    public int strStr(String haystack, String needle) {
        int a=-1,b=needle.length();
        if(haystack.length()==1 && needle.length()==1 && haystack.charAt(0)==needle.charAt(0)){
            a=0;
        }
        else{
            
        for(int i=0;i<=haystack.length()-b;i++){
            if((haystack.subSequence(i,b+i)).equals(needle)){
                a=i;
                break;
            }
        }
        }
        return a;
    }
}