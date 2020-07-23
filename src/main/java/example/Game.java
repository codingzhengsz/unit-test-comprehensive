package example;

public class Game {

    private AnswerGenerator answerGenerator;
    private GuessNumber guessNumber;
    private Validator validator;
    private ProcessController processController;

    private int[] answer;
    private int frequency;

    public Game(AnswerGenerator answerGenerator, GuessNumber guessNumber, Validator validator, ProcessController processController) {
        this.answerGenerator = answerGenerator;
        this.guessNumber = guessNumber;
        this.validator = validator;
        this.processController = processController;
        this.answer = this.answerGenerator.generateAnswer();
        this.frequency = 0;
    }

    public String play(int[] guessNumber) {
        if (!validator.validation(guessNumber)) {
            return "Wrong Input, Input again";
        }
        String guessResult = this.guessNumber.guess(this.answer, guessNumber);
        String result = this.processController.processControl(this.frequency++, guessResult);
        if ("Fail".equals(result)) {
            this.frequency = 0;
            this.answer = this.answerGenerator.generateAnswer();
        }
        return result;
    }

}
