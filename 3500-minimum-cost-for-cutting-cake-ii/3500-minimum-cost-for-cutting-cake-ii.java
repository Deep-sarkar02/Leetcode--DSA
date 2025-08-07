import java.util.*;

class Solution {
    public long minimumCost(int m, int n, int[] ch, int[] cv) {
        // Convert int[] to Integer[] for reverse sorting
        Integer[] chObj = Arrays.stream(ch).boxed().toArray(Integer[]::new);
        Integer[] cvObj = Arrays.stream(cv).boxed().toArray(Integer[]::new);

        // Sort in decreasing order
        Arrays.sort(chObj, Collections.reverseOrder());
        Arrays.sort(cvObj, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1; // initially one piece each direction
        long cost = 0;

        while (h < chObj.length && v < cvObj.length) {
            if (chObj[h] >= cvObj[v]) {
                cost += (long) chObj[h] * vp;
                hp++;
                h++;
            } else {
                cost += (long) cvObj[v] * hp;
                vp++;
                v++;
            }
        }

        while (h < chObj.length) {
            cost += (long) chObj[h] * vp;
            hp++;
            h++;
        }

        while (v < cvObj.length) {
            cost += (long) cvObj[v] * hp;
            vp++;
            v++;
        }

        return cost;
    }
}
