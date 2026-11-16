class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int b[]=new int[friends.length];
        int j=0;
        for(int i=0;i<order.length;i++){
            for(int k=0;k<friends.length;k++){
                if(order[i]==friends[k]){
                    b[j]=order[i];
                    j++;
                }
            }
        }
        return b;
    }
}