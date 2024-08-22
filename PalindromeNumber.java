public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        StringBuilder reversed = new StringBuilder();

        for(int i = xString.length() - 1; i >= 0; i--){
            reversed.append(xString.charAt(i));
        }
            return xString.contentEquals(reversed);
        }
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
}
