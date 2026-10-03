class Solution {
    public int maximumWealth(int[][] accounts) {
        int s;
        int m=0;
        for(int i=0;i<accounts.length;i++){
            s=0;
            
            for(int j=0;j<accounts[i].length;j++){
                s=s+accounts[i][j];
            }
            if(s>m){
                m=s;
            }
        }
        return m;
    }
}