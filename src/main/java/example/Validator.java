package example;

import java.util.HashSet;
import java.util.Set;

public class Validator {

  public boolean validation(int[] guessAnswer) {
    if (hasRepeatNumber(guessAnswer)) return false;
    if (!isAllNumberBetween0And9(guessAnswer)) return false;
    return isLengthEqualsFour(guessAnswer);
  }

  private boolean isAllNumberBetween0And9(int[] guessAnswer) {
    for (int element : guessAnswer) {
      if (element < 0 || element > 9) {
        return false;
      }
    }
    return true;
  }

  private boolean hasRepeatNumber(int[] guessAnswer) {
    Set<Integer> counter = new HashSet<>();
    for (int element : guessAnswer) {
      if (counter.contains(element)) {
        return true;
      } else {
        counter.add(element);
      }
    }
    return false;
  }

  private boolean isLengthEqualsFour(int[] guessAnswer) {
    return guessAnswer.length == 4;
  }
}
