import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);

        for(int i = 0; i < s.length(); i++){
          int current = romans.get(s.charAt(i));
          if(i < s.length() - 1 && current < romans.get(s.charAt(i+1))) {
              result -= current;
          } else{
              result+=current;
          }
        }

        return result;
    }
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
}
