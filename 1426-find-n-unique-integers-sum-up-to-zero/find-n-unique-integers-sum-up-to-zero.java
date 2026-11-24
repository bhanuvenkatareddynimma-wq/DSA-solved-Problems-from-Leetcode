class Solution {
    public int[] sumZero(int n) {
        int a[]=new int[n];
        int j=0;
        for(int i=0;i<n/2;i++){
            a[i]=j+1;
            a[n-i-1]=-(j+1);
            j++;
            
        }
        return a;
    }
}