package goit.xdpiqbx.Problem7;

import java.util.HashMap;
import java.util.Map;

public class Problem7 {
    public int romeToArabic(String rome) {
        Map<Character, Integer> romeArabicValues = new HashMap<>();
        romeArabicValues.put('I', 1);
        romeArabicValues.put('V', 5);
        romeArabicValues.put('X', 10);
        romeArabicValues.put('L', 50);
        romeArabicValues.put('C', 100);
        romeArabicValues.put('D', 500);
        romeArabicValues.put('M', 1000);

        int result = 0;

        char[] romeDigits = rome.toCharArray();

        for (int i = 0; i < romeDigits.length; i++) {
            char currentDigit = romeDigits[i];
            int currentArabicValue = romeArabicValues.get(currentDigit);
            if(i == romeDigits.length - 1){
                result += currentArabicValue;
            }else{
                char nextDigit = romeDigits[i + 1];
                int nextArabicValue = romeArabicValues.get(nextDigit);
                if(nextArabicValue > currentArabicValue){
                    result += nextArabicValue - currentArabicValue;
                }else{
                    result += nextArabicValue + currentArabicValue;
                }
                i++;
            }
        }
        return result;
    }

    public String arabicToRome(int arabic) {
        Map<Character, Integer> romeArabicValues = new HashMap<>();
        romeArabicValues.put('I', 1);
        romeArabicValues.put('V', 5);
        romeArabicValues.put('X', 10);
        romeArabicValues.put('L', 50);
        romeArabicValues.put('C', 100);
        romeArabicValues.put('D', 500);
        romeArabicValues.put('M', 1000);

        return "I";
    }
}
