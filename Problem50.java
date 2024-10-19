public class Problem50 {
    public static double pow(double x, int n) {
        if (n == 0) return 1.0;

        long longN = n;
        if (longN < 0) {
            x = 1 / x;
            longN = -longN;
        }

        return powDivideAndConquer(x, longN);
    }

    private static double powDivideAndConquer(double x, long n) {
        if (n == 0) return 1.0;

        double half = powDivideAndConquer(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(10,2));
    }
}
