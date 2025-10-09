package 2025.Octomber.9th_Octomber;

class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[][] S = new long[n][m];
        for (int j = 0; j < m; j++) S[0][j] = (long) skill[0] * mana[j];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) S[i][j] = S[i - 1][j] + (long) skill[i] * mana[j];
        }
        long[] t = new long[m];
        t[0] = 0;
        for (int j = 1; j < m; j++) {
            long best = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                long Si_prev = S[i][j - 1];
                long Sprev_j = (i > 0) ? S[i - 1][j] : 0L;
                long val = t[j - 1] + Si_prev - Sprev_j;
                if (val > best) best = val;
            }
            t[j] = best;
        }
        return t[m - 1] + S[n - 1][m - 1];
    }
}

