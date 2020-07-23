package example;

public class ResultGenerator {

    public String generateResult(int[] answer, int[] guessNumber) {
        boolean isAllCorrect = true;
        for (int index = 0; index < answer.length; index ++) {
            if (answer[index] != guessNumber[index]) {
                isAllCorrect = false;
                break;
            }
        }
        if (isAllCorrect) {
            return "4A0B";
        }
        return null;
    }

}
