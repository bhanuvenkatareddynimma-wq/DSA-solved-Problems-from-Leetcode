
class Solution {
    public int reverse(int x) {
        int r, rev = 0, g = 0;

        while (x != 0) {
            r = x % 10;
            x = x / 10;

            if (rev > 214748364 ||(rev == 214748364 && r > 7)) {
                return 0;
            }

            if (rev < -214748364 ||(rev == -214748364 && r < -8)) {
                return 0;
            }

            rev = rev * 10 + r;
            g = rev;
        }

        return g;
    }
}
