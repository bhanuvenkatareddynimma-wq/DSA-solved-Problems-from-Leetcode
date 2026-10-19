class Solution {
    public boolean squareIsWhite(String coordinates) {
          boolean a=false;
        String s=coordinates;
        char c=s.charAt(1);
      int n = Integer.parseInt(String.valueOf(c));
              System.out.print(n);
      if(s.length()==2){
          if((s.charAt(0)=='a' || s.charAt(0)=='c' || s.charAt(0)=='e' || s.charAt(0)=='g') && n%2==0){
              a=true;
            }
          else if((s.charAt(0)=='b' || s.charAt(0)=='d' || s.charAt(0)=='f' || s.charAt(0)=='h') && n%2==1){
              a=true;
            }
      }
      return a;
    }
}