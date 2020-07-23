package example;

public class GuessNumber {

    public String guess(int[] answer, int[] guessNumber) {
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
        return "0A0B";
    }

}
