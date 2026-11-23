class Solution {
    public int maxProduct(int n) {
        int d=0;
        String s=Integer.toString(n);
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            String s1=""+s.charAt(i);
            int m=Integer.parseInt(s1);
            a[i]=m;
        }

        Arrays.sort(a);
        d=a[a.length-1]*a[a.length-2];
        return d;
    }
}