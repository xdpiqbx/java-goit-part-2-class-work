package goit.xdpiqbx.Problem7;

import java.util.HashMap;
import java.util.Map;

public class Problem7 {
    public int romeToArabic(String rome) {
        Map<Character, Integer> romeArabicValues = new HashMap<>();
        romeArabicValues.put('I', 1);
        romeArabicValues.put('V', 5);
        romeArabicValues.put('X', 10);

        int result = 0;

        char[] romeDigits = rome.toCharArray();

        for (int i = 0; i < romeDigits.length; i++) {
            char currentDigit = romeDigits[i];
            if(i == romeDigits.length - 1){
                result += romeArabicValues.get(currentDigit);
            }else{
                char nextDigit = romeDigits[i + 1];
                int nextDigitArabicValue = romeArabicValues.get(nextDigit);
                //....
            }
        }

        for (char c : rome.toCharArray()){
            switch (c){
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                default: throw new IllegalArgumentException("Not implemented");
            }
        }
        return result;
    }
}
