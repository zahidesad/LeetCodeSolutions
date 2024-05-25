package ValidAnagram;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println(solution.isAnagram(s1, t1));
        System.out.println(solution.isAnagram(s2, t2));
    }
}
