package example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AnswerGenerator {
  private final Random random = new Random();

  public int[] generateAnswer() {
    int[] result = new int[4];
    Set<Integer> counter = new HashSet<>();
    int count = 0;
    while (count < 4) {
      int element = random.nextInt(10);
      if (!counter.contains(element)) {
        counter.add(element);
        result[count] = element;
        count++;
      }
    }
    return result;
  }
}
