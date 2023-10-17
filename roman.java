import java.util.HashMap;

public class roman {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanValues.get(s.charAt(i));
            int next = (i < s.length() - 1) ? romanValues.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "CC";
        int integerValue = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + integerValue);
    }
}

    

