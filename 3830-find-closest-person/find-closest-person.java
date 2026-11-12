class Solution {
    public int findClosest(int x, int y, int z) {
        int k=0;
        if(Math.abs(x-z)>Math.abs(y-z)){
            k=2;
        }
        else if(Math.abs(x-z)<Math.abs(y-z)){
            k=1;
        }
        else{
            k=0;
        }
        return k;
    }
}