package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumber {

    public String guess(int[] answer, int[] guessNumber) {
        Set<Integer> answerSet = new HashSet<>();
        Set<Integer> guessSet = new HashSet<>();
        for (int i : answer) {
            answerSet.add(i);
            guessSet.add(i);
        }
        int notSamePositionAndSameNumberCount = 0;
        int samePositionAndSameNumberCount = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == guessNumber[index]) {
                samePositionAndSameNumberCount ++;
            } else {
                if (answerSet.contains(answer[index]) && guessSet.contains(guessNumber[index])) {
                    notSamePositionAndSameNumberCount++;
                }
            }
        }
        return String.format("%dA%dB",samePositionAndSameNumberCount, notSamePositionAndSameNumberCount);
    }
}
