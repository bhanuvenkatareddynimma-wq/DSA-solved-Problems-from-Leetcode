class Solution {
    public int mostWordsFound(String[] sentences) {
        int l=0;
        for(int i=0;i<sentences.length;i++){
            String s[]=sentences[i].split(" ");
            if(l<s.length){
                l=s.length;
            }
            
        }
        return l;
    }
}