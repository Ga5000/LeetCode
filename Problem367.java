public class Problem367 {
    public static boolean isPerfectSquare(int num) {
        long left = 1, right = num + 1, product;
        while (left < right) {
            long mid = left + (right - left) / 2;
            product = mid * mid;
            if (product == num) {
                return true;
            }

            if (product > num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
