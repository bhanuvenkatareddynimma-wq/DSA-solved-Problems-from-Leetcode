class Solution {
    public String interpret(String command) {
        String s=command;
        s=s.replace("()","o");
        s=s.replace("(al)","al");
        return s;
    }
}