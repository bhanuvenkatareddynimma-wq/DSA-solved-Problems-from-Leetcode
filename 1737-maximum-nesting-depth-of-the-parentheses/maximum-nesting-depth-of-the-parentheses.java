class Solution {
    public int maxDepth(String s) {
        int c=0,n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
                if(n<c){
                    n=c;
                }
            }
            else if(s.charAt(i)==')'){
                c--;
            }
        }
        return n;
    }
}