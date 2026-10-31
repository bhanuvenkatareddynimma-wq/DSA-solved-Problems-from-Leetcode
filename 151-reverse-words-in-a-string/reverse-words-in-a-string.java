class Solution {
    public String reverseWords(String s) {
        String st[]=s.split(" ");
        String se=" ";
        for(int i=st.length-1;i>=0;i--){
            se=se+st[i];
            se=se.trim();
            se=se+" ";
        }
        
        se=se.strip();

        return se;
    }
}