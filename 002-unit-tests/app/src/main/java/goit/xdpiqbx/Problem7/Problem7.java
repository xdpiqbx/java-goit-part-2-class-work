package goit.xdpiqbx.Problem7;

public class Problem7 {
    public int romeToArabic(String rome) {
        int result = 0;
        for (char c : rome.toCharArray()){
            switch (rome){
                case "I": return 1;
                case "II": return 2;
                default: throw new IllegalArgumentException("Not implemented");
            }
        }
        return 0;
    }
}
