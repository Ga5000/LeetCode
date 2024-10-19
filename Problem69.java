public class Problem69 {

    public static int sqrt(int x) {
        if (x < 0) return -1;

        int start = 0, end = x;
        long mid;
        int result = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                result = (int) mid;
                start = (int) mid + 1;
            } else {
                end = (int) mid - 1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }
}
