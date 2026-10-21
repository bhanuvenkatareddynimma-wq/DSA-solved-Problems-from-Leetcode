class Solution {
    public String reverseWords(String s) {
        String ss="";
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
        StringBuffer sb=new StringBuffer(arr[i]);
            ss=ss+sb.reverse()+" ";
            
        }
        ss=ss.strip();
        return ss;
    }
}