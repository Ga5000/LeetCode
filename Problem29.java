public class Problem29 {
    public static int divide(int dividend, int divisor) {
        int result = 0;
        if (divisor != 0) {
            result = dividend / divisor;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            if (result > max) {
                max = result;
            }
            if (result < min) {
                min = result+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
