class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al=new ArrayList<>();
       
        int max=0;
        for(int j=0;j<candies.length;j++){
            if(max<=candies[j]){
                max=candies[j];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                al.add(true);
            }
            else{
                al.add(false);
            }
        }
        return al;
        
    }
}