class Solution {
    public double myPow(double x, int n) {
        long binaryform = n;

        if (binaryform < 0) {
            binaryform = -binaryform;
        }

        double result = 1.0;

        while (binaryform > 0) {
            if (binaryform % 2 == 1) {
                result *= x;
            }

            x *= x;
            binaryform /= 2;
        }

        return n < 0 ? 1.0 / result : result;
    }
}