package io.github.swar101.dsa.dp.advanced.dpdigit.problem;

import java.util.Arrays;

public class DMagicNumbers {

    final int MOD = 1_000_000_007;
    int C, D;
    int[] digits;
    int[][][][][] memo;

    public int solve(String A, String B, int C, int D) {
        this.C = C;
        this.D = D;

        int ansB = count(B);
        String aMinus1 = subtractOne(A);
        int ansA = count(aMinus1);
        int ans = ansB - ansA;
        if (ans < 0) ans += MOD;
        return ans;
    }

    private int count(String N) {
        if (N.equals("0")) return 0;
        int L = N.length();
        digits = new int[L];
        for (int i = 0; i < L; i++) digits[i] = N.charAt(i) - '0';
        memo = new int[L][2][2][2][C];
        for (int[][][][] arr1 : memo)
            for (int[][][] arr2 : arr1)
                for (int[][] arr3 : arr2)
                    for (int[] arr4 : arr3)
                        Arrays.fill(arr4, -1);
        return dp(0, 1, 0, 0, 0, L);
    }

    private int dp(int pos, int tight, int started, int parity, int rem, int L) {
        if (pos == L) {
            if (started == 0) return 0;
            return rem == 0 ? 1 : 0;
        }

        if (memo[pos][tight][started][parity][rem] != -1) {
            return memo[pos][tight][started][parity][rem];
        }

        int limit = (tight == 1 ? digits[pos] : 9);
        long ans = 0;

        for (int dig = 0; dig <= limit; dig++) {
            int newTight = (tight == 1 && dig == limit) ? 1 : 0;
            if (started == 0 && dig == 0) {
                ans += dp(pos + 1, newTight, 0, 0, 0, L);
            } else {
                int curParity = (started == 0 && dig != 0) ? 0 : parity;

                if (curParity == 1) {
                    if (dig != D) continue;
                } else {
                    if (dig == D) continue;
                }

                int newRem = (rem * 10 + dig) % C;
                int nextParity = (started == 0 && dig != 0) ? 1 : 1 - curParity;
                ans += dp(pos + 1, newTight, 1, nextParity, newRem, L);
            }
            if (ans >= MOD) ans -= MOD;
        }

        return memo[pos][tight][started][parity][rem] = (int) ans;
    }


    private String subtractOne(String A) {
        if (A.equals("0")) return "0";
        char[] arr = A.toCharArray();
        int i = arr.length - 1;
        while (i >= 0 && arr[i] == '0') {
            arr[i] = '9';
            i--;
        }
        if (i >= 0) arr[i]--;
        int start = 0;
        while (start < arr.length - 1 && arr[start] == '0') start++;
        return new String(arr, start, arr.length - start);
    }
}