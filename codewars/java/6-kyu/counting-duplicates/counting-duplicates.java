import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
      String formatted = text.toLowerCase();
      Map<Character, Integer> charCount = new HashMap<>();
      
      for (char c : formatted.toCharArray()) {
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
      }
      
      return (int) charCount.values().stream()
        .filter(v -> v > 1)
        .mapToInt(v -> Integer.valueOf(v))
        .count();
    }
}
