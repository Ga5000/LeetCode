import java.util.Arrays;

public class Problem34 {
    //Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    //If target is not found in the array, return [-1, -1].
    //You must write an algorithm with O(log n) runtime complexity.

    public static int[] searchRange(int[] nums, int target){
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                res[0] = i;
                break;
            }

        }
        for(int j = nums.length - 1; j >= 0; j--){
            if(nums[j] == target){
                res[1] = j;
                break;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] list = {};
        System.out.println(Arrays.toString(searchRange(list, 0)));
    }
}
