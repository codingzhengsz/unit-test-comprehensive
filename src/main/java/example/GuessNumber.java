package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumber {

  public String guess(int[] answer, int[] guessNumber) {
    return formatResultMsg(
        countNotSamePositionAndSameNumber(answer, guessNumber),
        countSamePositionAndSameNumber(answer, guessNumber));
  }

  private int countNotSamePositionAndSameNumber(int[] answerNumber, int[] guessNumber) {
    int count = 0;
    Set<Integer> guessSet = convertArrayToSet(guessNumber);
    for (int index = 0; index < answerNumber.length; index++) {
      if (answerNumber[index] != guessNumber[index] && guessSet.contains(answerNumber[index])) {
        count++;
      }
    }
    return count;
  }

  private int countSamePositionAndSameNumber(int[] answerNumber, int[] guessNumber) {
    int count = 0;
    for (int index = 0; index < answerNumber.length; index++) {
      if (answerNumber[index] == guessNumber[index]) {
        count++;
      }
    }
    return count;
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
