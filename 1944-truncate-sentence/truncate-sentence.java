class Solution {
    public String truncateSentence(String s, int k) {
        String t="";
        String a[]=s.split(" ");
        for(int i=0;i<k;i++){
            t=t+a[i]+" ";
            
        }
        t=t.strip();
        return t;
    }
}