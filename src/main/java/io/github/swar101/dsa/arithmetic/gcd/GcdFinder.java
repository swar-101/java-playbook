package io.github.swar101.dsa.arithmetic.gcd;

public class GcdFinder {

    /*
    * Brute Force : O(N) where N is min(a, b)
    * */
    public static int bruteFindGcd(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    /*
    * Euclidean Algorithm : O(Log N) where N is min(a, b)
    * */
    public static int findGcd(int a, int b) {
        if (b == 0) return a;
        return findGcd(b, a % b);
    }
}