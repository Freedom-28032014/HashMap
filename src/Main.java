import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> fregs = new HashMap<>();

        for (int i = 0; i < TEXT.length(); i++) {
            char c = TEXT.charAt(i);
            if (!Character.isLetter(c)) {
                continue;
            }
            if (fregs.containsKey(c)) {
                fregs.put(c, fregs.get(c) + 1);
            } else {
                fregs.put(c, 1);
            }

        }
        int freqMax = -1;
        char charMax = 0;
        for (char c : fregs.keySet()) {
            int freq = fregs.get(c);
            if (freq > freqMax) {
                freqMax = freq;
                charMax = c;
            }
        }
        System.out.println("Макс. частота у символа " + charMax + ":" + freqMax);
    }

}

