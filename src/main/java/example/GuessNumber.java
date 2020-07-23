package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumber {

    public String guess(int[] answer, int[] guessNumber) {
        boolean isAllCorrect = true;
        Set<Integer> answerSet = new HashSet<>();
        Set<Integer> guessSet = new HashSet<>();
        for (int index = 0; index < answer.length; index ++) {
            if (answer[index] != guessNumber[index]) {
                isAllCorrect = false;
            }
            answerSet.add(answer[index]);
            guessSet.add(answer[index]);
        }
        if (isAllCorrect) {
            return "4A0B";
        } else {
            int count = 0;
            for (int index = 0; index < answer.length; index++) {
                if (answerSet.contains(answer[index]) && guessSet.contains(guessNumber[index])) {
                    count++;
                }
            }
            return String.format("0A%dB", count);
        }
    }

}
