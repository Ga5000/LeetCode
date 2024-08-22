import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            map.put(i,nums[i]);
        }

        for(int j = 0; j < nums.length;j++){
           if(map.get(j) + map.get(j+1) == target){
               result[0] = j;
               result[1] = j+1;
               break;
           }
        }
            return result;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
