import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        Map<Integer, String> romans = new LinkedHashMap<>();
        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(500, "D");
        romans.put(400, "CD");
        romans.put(100, "C");
        romans.put(90, "XC");
        romans.put(50, "L");
        romans.put(40, "XL");
        romans.put(10, "X");
        romans.put(9, "IX");
        romans.put(5, "V");
        romans.put(4, "IV");
        romans.put(1, "I");

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romans.entrySet()) {
            int value = entry.getKey();
            String roman = entry.getValue();

            while (num >= value) {
                result.append(roman);
                num -= value;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int num = 3749;
        System.out.println(intToRoman(num));
    }
}
