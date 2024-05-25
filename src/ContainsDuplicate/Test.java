package ContainsDuplicate;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        int [] nums1= {1,2,3,1};
        int [] nums2= {1,2,3,4};
        int [] nums3= {1,1,1,3,3,4,3,2,4,2};

        System.out.println(s.containsDuplicate(nums1));
        System.out.println(s.containsDuplicate(nums2));
        System.out.println(s.containsDuplicate(nums3));

    }
}
