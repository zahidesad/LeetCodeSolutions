package TopKFrequentElements;

import static TopKFrequentElements.Solution.topKFrequent;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] result = topKFrequent(nums, 2);

        for (int j : result) {
            System.out.println(j);
        }
    }
}
