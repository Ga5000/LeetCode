import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem17 {
//    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
//    Return the answer in any order.
//    A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return res;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");


        backtrack(res,map,digits,0, new StringBuilder());
        return res;
    }

    private static void backtrack(List<String> res, Map<Character, String> map, String digits, int index, StringBuilder current){
        if(index == digits.length()){
            res.add(current.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));

        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(res, map, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }
}
