class Solution {
    public double myPow(double x, int n) {
        // Handle -ve pow
        long N = n;   // no overdlow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        while (N > 0) {
            if (N % 2 == 1) {
                ans = ans * x;   // odd pow
            }
            x = x * x;          // sqr
            N = N / 2;          // half pow
        }
        return ans;
    }
}