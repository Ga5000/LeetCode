import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length-1;i++){
            for(int j = 0; j < nums.length - i - 1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] numbers = {9,1,2,6,7,8,3,5,4};
        sortColors(numbers);
    }
}
