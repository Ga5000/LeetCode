public class StringIsaPrefixOfArray {
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder concat = new StringBuilder();
        for (String word : words) {
            concat.append(word);
            if (s.contentEquals(concat)) {
                return true;
            }
        }
            return false;
    }
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s,words));
    }
}
