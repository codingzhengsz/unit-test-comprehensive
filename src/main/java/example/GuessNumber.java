package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumber {

  public String guess(int[] answer, int[] guessNumber) {
    Set<Integer> answerSet = new HashSet<>();
    Set<Integer> guessSet = new HashSet<>();
    for (int i : answer) {
      answerSet.add(i);
    }
    for (int i : guessNumber) {
      guessSet.add(i);
    }
    int notSamePositionAndSameNumberCount = 0;
    int samePositionAndSameNumberCount = 0;
    for (int index = 0; index < answer.length; index++) {
      if (answer[index] == guessNumber[index]) {
        samePositionAndSameNumberCount++;
      } else {
        if (guessSet.contains(answer[index])) {
          notSamePositionAndSameNumberCount++;
        }
      }
    }
    return formatResultMsg(notSamePositionAndSameNumberCount, samePositionAndSameNumberCount);
  }

  private String formatResultMsg(
      int notSamePositionAndSameNumberCount, int samePositionAndSameNumberCount) {
    return String.format(
        "%dA%dB", samePositionAndSameNumberCount, notSamePositionAndSameNumberCount);
  }
}
