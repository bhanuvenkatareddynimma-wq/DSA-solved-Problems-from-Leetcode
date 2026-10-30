class Solution {
    public int countSegments(String s) {
        int a=0;
        if(s.length()==0){
            a=0;
        }
        else{
        String st[]=s.split(" ");
        for(int i=0;i<st.length;i++){
            if(st[i]!=""){
                a++;
            }
        }
        
    }
        return a;
    }
}