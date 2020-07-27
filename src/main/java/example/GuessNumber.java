package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumber {

  public String guess(int[] answer, int[] guessNumber) {
    Set<Integer> guessSet = convertArrayToSet(guessNumber);
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

  private Set<Integer> convertArrayToSet(int[] guessNumber) {
    Set<Integer> resultSet = new HashSet<>();
    for (int i : guessNumber) {
      resultSet.add(i);
    }
    return resultSet;
  }

  private String formatResultMsg(
      int notSamePositionAndSameNumberCount, int samePositionAndSameNumberCount) {
    return String.format(
        "%dA%dB", samePositionAndSameNumberCount, notSamePositionAndSameNumberCount);
  }
}
