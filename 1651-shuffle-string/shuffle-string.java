class Solution {
    public String restoreString(String s, int[] indices) {
        char b[]=new char[indices.length];
        String st="";
        for(int i=0;i<s.length();i++){
            b[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            st=st+b[i];   

        }
        return st;
    }
}