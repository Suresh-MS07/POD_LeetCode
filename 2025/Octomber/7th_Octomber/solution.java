package 2025.Octomber.7th_Octomber;

import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> full = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1;
            } else {
                ans[i] = -1;
                if (full.containsKey(rains[i])) {
                    Integer dry = dryDays.higher(full.get(rains[i]));
                    if (dry == null) return new int[0];
                    ans[dry] = rains[i];
                    dryDays.remove(dry);
                }
                full.put(rains[i], i);
            }
        }
        return ans;
    }
}
