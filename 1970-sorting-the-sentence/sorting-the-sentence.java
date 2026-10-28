class Solution {
    public String sortSentence(String s) {
        String h[]=s.split(" ");
        String ss="";
        String arr[]=new String[h.length];
        for(int i=0;i<h.length;i++){
            StringBuffer sb=new StringBuffer(h[i]);
            int n=Integer.parseInt(String.valueOf(h[i].charAt(h[i].length()-1)));
            arr[n-1]=sb.substring(0,sb.length()-1);
        }
        for(int i=0;i<arr.length;i++){
        ss=ss+arr[i]+" ";
    }
        ss=ss.substring(0,ss.length()-1);
        return ss;
    }
}