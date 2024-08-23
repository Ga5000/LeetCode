public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
            return left;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7};
        System.out.println(searchInsert(nums,7));
        System.out.println(searchInsert(nums,8));
    }
}
