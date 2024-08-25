import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums) {
            integerSet.add(num);
        }

        return nums.length > integerSet.size();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));
    }
}
