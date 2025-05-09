import java.util.ArrayList;
import java.util.HashMap;

public class LongestPossibleSubString {
    public static void main(String[] args) {
        String ip = "pwwdcbiuykew";

        int max = 0;
        int left = 0;

        HashMap<Character, Integer> position = new HashMap<>();
        ArrayList<String> longestSubstrings = new ArrayList<>();

        for (int right = 0; right < ip.length(); right++) {
            char current = ip.charAt(right);

            if (!position.containsKey(current)) {
                position.put(current, right);
            } else {
                left = Math.max(left, position.get(current) + 1);
                position.put(current, right);
            }

            int currentLength = right - left + 1;

            if (currentLength > max) {
                max = currentLength;
                longestSubstrings.clear();  // Clear old substrings
                longestSubstrings.add(ip.substring(left, right + 1));
            } else if (currentLength == max) {
                longestSubstrings.add(ip.substring(left, right + 1));
            }
        }

        System.out.println("Max. Length of the Sub-string: " + max);
        System.out.println("All longest substrings:");
        for (String s : longestSubstrings) {
            System.out.println(s);
        }
    }
}
