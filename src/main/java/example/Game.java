package example;

public class Game {

    private AnswerGenerator answerGenerator;
    private GuessNumber guessNumber;
    private Validator validator;
    private ProcessController processController;

    private int[] answer;

    public Game(AnswerGenerator answerGenerator, GuessNumber guessNumber, Validator validator, ProcessController processController) {
        this.answerGenerator = answerGenerator;
        this.guessNumber = guessNumber;
        this.validator = validator;
        this.processController = processController;
        answer = this.answerGenerator.generateAnswer();
    }

    public String play(int[] guessNumber) {
        return null;
    }

}
