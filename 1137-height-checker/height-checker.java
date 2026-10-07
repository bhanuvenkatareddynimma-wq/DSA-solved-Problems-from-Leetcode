class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=new int[heights.length];
        int c=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<arr.length;i++){
            if(heights[i]!=arr[i]){
                c=c+1;
            }
        }
        return c;
    }
}