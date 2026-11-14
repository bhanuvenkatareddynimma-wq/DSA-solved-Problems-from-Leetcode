class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int s=requests[0],k=0;;
        for(int i=0;i<requests.length-1;i++){
            s=s+Math.abs(requests[i]-requests[i+1]);
            
        }
        return s;
    }
}