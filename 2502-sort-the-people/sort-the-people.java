class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String s[]=new String[names.length];
        int n=0,k=0,m=0;
        for(int i=0;i<names.length;i++){
            n=0;
            k=0;
            for(int j=0;j<names.length;j++){
                if(n<heights[j]){
                    n=heights[j];
                    k=j;
                }
            }
            s[m]=names[k];
            heights[k]=0;
            m++;
        }
        return s;
    }
}