package GroupAnagrams;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs1));

        String[] strs2 = {""};
        System.out.println(solution.groupAnagrams(strs2));

        String[] strs3 = {"a"};
        System.out.println(solution.groupAnagrams(strs3));

    }
}
