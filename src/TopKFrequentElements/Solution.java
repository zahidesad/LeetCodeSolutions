package TopKFrequentElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        PriorityQueue<Map.Entry<Integer, Integer>> topKElements = new PriorityQueue<>(
                (e1, e2) -> e1.getValue() - e2.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            topKElements.add(entry);
            if (topKElements.size() > k) {
                topKElements.poll();
            }
        }

        int[] topNumbers = new int[k];

        int i = 0;
        while (!topKElements.isEmpty()) {
            topNumbers[i] = topKElements.poll().getKey();
            i++;
        }

        return topNumbers;
    }
}
