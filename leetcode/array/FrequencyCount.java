import java.util.*;

public class FrequencyCount {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 1, 4, 2 };

    Map<Integer, Integer> freqMap = new HashMap<>();

    for (int num : arr) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Print frequencies
    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
      System.out.println("Element: " + entry.getKey() + " -> Frequency: " + entry.getValue());
    }
  }
}
