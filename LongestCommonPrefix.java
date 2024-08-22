import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1];
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < Math.min(first.length(),last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return result.toString();
            }
                result.append(first.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
