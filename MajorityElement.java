import java.util.*;
public class Solution {
    public static int majorityElement(int []v) {
        int n = v.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(v[i], 0);
            map.put(v[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
}